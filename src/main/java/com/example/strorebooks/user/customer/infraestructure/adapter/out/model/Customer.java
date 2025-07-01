package com.example.strorebooks.user.customer.infraestructure.adapter.out.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "\"user\"")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @Column(nullable = false)
   @NotNull(message = "name not null")
   String name;

   @Column(nullable = false)
   @NotNull(message = "lastname not null")
   String lastname;


   @Column(nullable = false)
   @NotNull(message = "phone not null")
   String phone;

   @Column(nullable = false)
   @NotNull(message = "address not null")
   String address;

   @Column(nullable = false)
   @NotNull(message = "dateOfBirth not null")
   @Past(message = "dateOfBirth must be in the past")
   LocalDate dateOfBirth;

   @Column(nullable = false, unique = true)
   @NotNull(message = "identification_number not null")
   String identificationNumber;

   @Column( name = "state_name", nullable = false)
   @Enumerated(EnumType.STRING)
   State state;

}
