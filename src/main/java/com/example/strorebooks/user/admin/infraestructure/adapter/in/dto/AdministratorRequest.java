package com.example.strorebooks.user.admin.infraestructure.adapter.in.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AdministratorRequest {

    @NotBlank(message = "Name must not be null or empty")
    @Size(max = 30, message = "Name must not exceed 30 characters")
    private String name;

    @NotBlank(message = "Lastname must not be null or empty")
    @Size(max = 30, message = "Lastname must not exceed 30 characters")
    private String lastname;

    @NotBlank(message = "Username must not be null or empty")
    @Size(max = 30, message = "Username must not exceed 30 characters")
    private String username;

    @NotBlank(message = "Password must not be null or empty")
    @Size(min = 8, max = 30, message = "Password must be between 8 and 30 characters")
    private String password;
}
