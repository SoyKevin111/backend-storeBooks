package com.example.strorebooks.handlerError.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ServerInternalError extends RuntimeException{
   String message;
   String error;

   public ServerInternalError(String message) {
      this.message = message;
   }
   public ServerInternalError(String message, String error) {
      this.message = message;
      this.error = error;
   }
}
