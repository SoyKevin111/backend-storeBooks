package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @Column(name = "name", nullable = false)
   @NotNull(message = "name not null")
   String name;

   @Column(name = "lastname", nullable = false)
   @NotNull(message = "lastname not null")
   String lastname;

   @Column(name = "email", nullable = false)
   @NotNull(message = "email not null")
   String email;

   @Column(name = "numberIdentification", nullable = false, unique = true)
   @NotNull(message = "numberIdentification not null")
   String numberIdentification;

   @Column(name = "state_name", nullable = false)
   @Enumerated(EnumType.STRING)
   State state;

   @ManyToMany(mappedBy = "authors")
   @JsonBackReference
   Set<Book> books = new HashSet<>();
}
