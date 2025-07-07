package com.example.strorebooks.handlerError.infraestructure;

import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.handlerError.infraestructure.dto.ExceptionErrorResponse;
import com.example.strorebooks.handlerError.infraestructure.dto.FieldErrorResponse;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;

@ControllerAdvice
public class GlobalHanlderException {

   //Validacion generica
   @ExceptionHandler(ServerInternalError.class)
   public ResponseEntity<ExceptionErrorResponse> handleGeneric(ServerInternalError ex) {
      String error = ex.getError();
      String message = ex.getMessage();

      ExceptionErrorResponse response = ExceptionErrorResponse.builder()
         .timestamp(LocalDateTime.now())
         .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
         .error((error == null || error.isEmpty()) ? "[Server Internal Error]" : error)
         .message((message == null || message.isEmpty()) ? "Server Internal Error" : message)//solo detallas aca el error
         .build();

      return ResponseEntity
         .status(HttpStatus.INTERNAL_SERVER_ERROR)
         .body(response);
   }

   //Validaciones de propiedades con @Valid
   @ExceptionHandler(MethodArgumentNotValidException.class)
   public ResponseEntity<ExceptionErrorResponse> handleProperty(
      MethodArgumentNotValidException ex
   ) {
      List<FieldErrorResponse> errors = ex.getBindingResult().getFieldErrors()
         .stream()
         .map(err -> new FieldErrorResponse(err.getField(), err.getDefaultMessage()))
         .toList();

      ExceptionErrorResponse response = ExceptionErrorResponse.builder()
         .timestamp(LocalDateTime.now())
         .status(HttpStatus.BAD_REQUEST.value())
         .error("[Request Error]")
         .errors(errors)
         .build();

      return ResponseEntity
         .status(HttpStatus.BAD_REQUEST)
         .body(response);
   }

   //Validacion de cualquier ENUM (Role, Status, etc) || Fecha
   @ExceptionHandler(HttpMessageNotReadableException.class)
   public ResponseEntity<ExceptionErrorResponse> handleInvalidFormat(HttpMessageNotReadableException ex) {
      if (ex.getCause() instanceof InvalidFormatException ife) {
         Class<?> targetType = ife.getTargetType();

         if (targetType.isEnum()) {
            ExceptionErrorResponse response = ExceptionErrorResponse.builder()
               .timestamp(LocalDateTime.now())
               .status(HttpStatus.BAD_REQUEST.value())
               .error("[Enum Type]")
               .message("Invalid Enum type: " + ife.getValue())
               .build();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
         }

         if (targetType.equals(java.time.LocalDate.class)) {
            ExceptionErrorResponse response = ExceptionErrorResponse.builder()
               .timestamp(LocalDateTime.now())
               .status(HttpStatus.BAD_REQUEST.value())
               .error("[Date Format]")
               .message("Invalid date format for 'dateOfBirth': " + ife.getValue() +
                  ". The expected format is yyyy-MM-dd")
               .build();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
         }
      }
      return null;
   }


}
