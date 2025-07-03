package com.example.strorebooks.user.customer.infraestructure.adapter.out.model;

import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @NotNull
   @Column(nullable = false)
   private String name;

   @NotNull
   @Column(nullable = false)
   private String lastname;

   @NotNull
   @Column(nullable = false)
   private String phone;

   @NotNull
   @Column(nullable = false)
   private String address;

   @NotNull
   @Past
   @Column(nullable = false)
   private LocalDate dateOfBirth;

   @NotNull
   @Column(nullable = false, unique = true)
   private String identificationNumber;

   @NotNull
   @Enumerated(EnumType.STRING)
   @Column(name = "state_name", nullable = false)
   private State state;

}
