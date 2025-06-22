package com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model;

import jakarta.persistence.*;
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

}
