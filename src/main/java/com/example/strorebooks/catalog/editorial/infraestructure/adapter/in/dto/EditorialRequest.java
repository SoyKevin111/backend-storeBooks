package com.example.strorebooks.catalog.editorial.infraestructure.adapter.in.dto;

import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.State;
import jakarta.validation.constraints.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class EditorialRequest {

   @NotBlank(message = "Name must not be null or empty")
   @Size(max = 50, message = "Name must not exceed 50 characters")
   String name;

   @NotBlank(message = "Phone must not be null or empty")
   @Pattern(regexp = "\\d{7,15}", message = "Phone must contain only digits and be between 7 and 15 characters")
   private String phone;

   @NotBlank(message = "Sitio web must not be null or empty")
   @Pattern(
      regexp = "^(https?://)?(www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/.*)?$",
      message = "Sitio web must be a valid URL"
   )
   String sitioWeb;

   @NotBlank(message = "Email must not be null or empty")
   @Email(message = "Email must be a valid email address")
   String email;

   State state;
}



