package com.example.strorebooks.core.application;

public class ISBNGenerator {

   public static String generateISBNBase() {
      String prefix = "978";
      String group = "84";        // idioma español
      String publisher = "376";   // editorial
      String title = String.format("%04d", (int)(Math.random() * 10000)); // número aleatorio de 4 dígitos

      return String.join("-", prefix, group, publisher, title) + "-";
   }

}
