package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.State;
import jakarta.validation.constraints.NotBlank;
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
    @Size(max = 15, message = "Name must not exceed 15 characters")
    String name;
    @NotBlank(message = "Lastname must not be null or empty")
    @Size(max = 15, message = "Lastname must not exceed 15 characters")
    String lastname;
    @NotBlank(message = "Email must not be null or empty")
    @Size(max = 50, message = "Email must not exceed 50 characters")
    String email;
    @NotBlank(message = "Phone must not be null or empty")
    @Size(max = 10, message = "Phone must not exceed 10 characters")
    String numberIdentification;

    State state;
}
