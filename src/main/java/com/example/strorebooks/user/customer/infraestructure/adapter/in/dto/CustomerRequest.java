package com.example.strorebooks.user.customer.infraestructure.adapter.in.dto;


import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.State;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CustomerRequest {

   Long id;

   @NotBlank(message = "Name must not be null or empty")
   @Size(max = 30, message = "Name must not exceed 30 characters")
   String name;

   @NotBlank(message = "Lastname must not be null or empty")
   @Size(max = 30, message = "Lastname must not exceed 30 characters")
   String lastname;

   @NotBlank(message = "Identification number must not be null or empty")
   @Size(max = 10, message = "identificationNumber must not exceed 10 characters")
   @Pattern(regexp = "\\d+", message = "Identification number must contain only digits")
   private String identificationNumber;

   @NotBlank(message = "Address must not be null or empty")
   @Size(max = 50, message = "Address must not exceed 100 characters")
   String address;

   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
   @Past(message = "dateOfBirth must be in the past")
   LocalDate dateOfBirth;

   @NotBlank(message = "Phone must not be null or empty")
   @Pattern(regexp = "\\d+", message = "Phone must contain only digits")
   @Size(min = 7, max = 15, message = "Phone must not exceed 15 characters or be less than 7 characters")
   private String phone;

   State state;
}
