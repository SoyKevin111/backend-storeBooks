package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @ManyToMany
   @JoinTable(
      name = "book_author",
      joinColumns = @JoinColumn(name = "book_id"),
      inverseJoinColumns = @JoinColumn(name = "author_id")
   )
   Set<Author> authors = new HashSet<>();
}
