package com.example.strorebooks.handlerError.infraestructure.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExceptionErrorResponse {
   private LocalDateTime timestamp;
   private int status;
   private String error;
   private String message;
   private List<FieldErrorResponse> errors;


   public ExceptionErrorResponse(
      LocalDateTime timestamp,
      int status,
      String error
   ) {
      this.timestamp = timestamp;
      this.status = status;
      this.error = error;
   }


}
