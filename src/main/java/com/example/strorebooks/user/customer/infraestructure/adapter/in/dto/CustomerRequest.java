package com.example.strorebooks.user.customer.infraestructure.adapter.in.dto;


import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.State;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
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
   @Size(max = 15, message = "Name must not exceed 50 characters")
   String name;

   @NotBlank(message = "Lastname must not be null or empty")
   @Size(max = 15, message = "Lastname must not exceed 50 characters")
   String lastname;

   @NotBlank(message = "Phone must not be null or empty")
   @Size(max = 10, message = "Phone must not exceed 10 characters")
   String phone;

   @NotBlank(message = "Address must not be null or empty")
   @Size(max = 50, message = "Address must not exceed 50 characters")
   String address;

   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
   @Past(message = "dateOfBirth must be in the past")
   LocalDate dateOfBirth;

   @NotBlank(message = "Identification number must not be null or empty")
   @Size(max = 10, message = "Identification number must not exceed 10 characters")
   String identificationNumber;

   State state;
}
