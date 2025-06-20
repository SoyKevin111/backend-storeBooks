package com.example.strorebooks.user.infraestructure.adapter.out.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "\"user\"")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @Column(nullable = false)
   @NotBlank(message = "name not null or empty")
   String name;

   @Column(nullable = false)
   @NotBlank(message = "lastname not null or empty")
   String lastname;

   @Column(nullable = false)
   @NotBlank(message = "phone not null or empty")
   String phone;

   @Column(nullable = false)
   @NotBlank(message = "address not null or empty")
   String address;

   @Column(nullable = false)
   @NotBlank(message = "dateOfBirth not null or empty")
   String dateOfBirth;

   @Column(nullable = false, unique = true)
   @NotBlank(message = "identificationNumber not null or empty")
   String identificationNumber;

   @Column(nullable = false, unique = true)
   @NotBlank(message = "state not null or empty")
   String state;

   @ManyToOne(cascade = CascadeType.REFRESH)
   @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
   Role role;
}
