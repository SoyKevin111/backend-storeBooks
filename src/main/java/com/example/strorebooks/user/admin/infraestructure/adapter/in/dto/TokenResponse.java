package com.example.strorebooks.user.admin.infraestructure.adapter.in.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenResponse {
   Long id;
   String username;
   String expiresAt;
}
