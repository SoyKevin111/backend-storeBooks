package com.example.strorebooks.user.infraestructure.adapter.out.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @Column(name = "role_name", nullable = false, unique = true)
   @NotBlank(message = "Role name must not be null or empty")
   String name;

}
