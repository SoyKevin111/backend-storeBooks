package com.example.strorebooks.user.admin.infraestructure.adapter.out.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "administrator")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Administrator {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   Long id;

   @Column(name = "name", nullable = false)
   @NotNull(message = "name cannot be null")
   String name;

   @Column(name = "lastname", nullable = false)
   @NotNull(message = "lastname cannot be null")
   String lastname;

   @Column(name = "username", nullable = false, unique = true)
   @NotNull(message = "username cannot be null")
   String username;

   @Column(name = "password", nullable = false)
   @NotNull(message = "password cannot be null")
   String password;
}