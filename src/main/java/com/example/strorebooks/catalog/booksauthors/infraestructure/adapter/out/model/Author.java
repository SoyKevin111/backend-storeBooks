package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model;

import jakarta.persistence.*;
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

   @ManyToMany(mappedBy = "authors")
   Set<Book> books = new HashSet<>();

}
