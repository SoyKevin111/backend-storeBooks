package com.example.strorebooks.catalog.editorial.infraestructure.adapter.in.dto;

import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.State;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class EditorialRequest {

    Long id;

    @NotBlank(message = "Name must not be null or empty")
    @Size (max = 50, message = "Name must not exceed 50 characters")
    String name;

    @NotBlank(message = "Phone must not be null or empty")
    @Size(max = 15, message = "Phone must not exceed 15 characters")
    String phone;

    @NotBlank(message = "Sitio web must not be null or empty")
    @Size(max = 50, message = "Sitio web must not exceed 50 characters")
    String sitioWeb;

    @NotBlank(message = "Email must not be null or empty")
    @Size(max = 50, message = "Email must not exceed 50 characters")
    String email;

    State state;
}



