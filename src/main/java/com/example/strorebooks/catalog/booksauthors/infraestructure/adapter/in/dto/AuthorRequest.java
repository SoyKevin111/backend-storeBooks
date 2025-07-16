package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.State;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AuthorRequest {

    Long id;

    @NotBlank(message = "Name must not be null or empty")
    @Size(max = 30, message = "Name must not exceed 15 characters")
    String name;
    @NotBlank(message = "Lastname must not be null or empty")
    @Size(max = 30, message = "Lastname must not exceed 15 characters")
    String lastName;
    @NotBlank(message = "Email must not be null or empty")
    @Email(message = "Email must be a valid email address")
    String email;

    @NotBlank(message = "Identification number must not be null or empty")
    @Pattern(regexp = "\\d{10}", message = "IdentificationNUmber must be exactly 10 digits")
    String identityNumber;

    State state;
}
