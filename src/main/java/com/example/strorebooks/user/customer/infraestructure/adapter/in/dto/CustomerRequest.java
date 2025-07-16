package com.example.strorebooks.user.customer.infraestructure.adapter.in.dto;


import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.State;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
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

   @NotBlank(message = "Name must not be null or empty")
   @Size(max = 30, message = "Name must not exceed 30 characters")
   String name;

   @JsonProperty("lastName")
   @NotBlank(message = "Lastname must not be null or empty")
   @Size(max = 30, message = "Lastname must not exceed 30 characters")
   String lastname;

   @JsonProperty("identityNumber")
   @NotBlank(message = "Identification number must not be null or empty")
   @Pattern(regexp = "\\d{10}", message = "IdentificationNUmber must be exactly 10 digits")
   private String identificationNumber;

   @NotBlank(message = "Address must not be null or empty")
   @Size(max = 50, message = "Address must not exceed 100 characters")
   String address;

   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
   @Past(message = "dateOfBirth must be in the past")
   LocalDate dateOfBirth;

   @NotBlank(message = "Phone must not be null or empty")
   @Pattern(regexp = "\\d{7,15}", message = "Phone must contain only digits and be between 7 and 15 characters")
   private String phone;

   State state;
}
