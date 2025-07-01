package com.example.strorebooks.core.application;

public class ISBNGenerator {

   public static String generateISBNBase() {
      String prefix = "978";
      String group = "84";
      String publisher = "376";
      String title = String.format("%04d", (int)(Math.random() * 10000));

      return String.join("-", prefix, group, publisher, title) + "-";
   }

}
