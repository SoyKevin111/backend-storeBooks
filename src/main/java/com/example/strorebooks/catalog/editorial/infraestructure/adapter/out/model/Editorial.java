package com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "editorial")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Editorial {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @Column(name = "name", nullable = false)
   @NotNull(message= "name not null")
   String name;

   @Column(nullable = false)
   @NotNull(message = "phone not null")
   String phone;

   @Column(nullable = false)
   @NotNull(message = "sitio web not null")
   String sitioWeb;

   @Column(nullable = false)
   @NotNull(message = "email not null")
   String email;

   @Column(name = "state_name", nullable = false)
   @Enumerated(EnumType.STRING)
   State state;


}
