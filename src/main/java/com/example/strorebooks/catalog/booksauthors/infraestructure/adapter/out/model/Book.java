package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model;

import com.example.strorebooks.catalog.editorial.infraestructure.adapter.out.model.Editorial;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
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

   //si puede ser null, despues de crear el objeto se modificara el isbn+id
   @Column(name = "isbn")
   String isbn;

   @Column(name = "title")
   @NotNull(message = "title not null")
   String title;

   @Column(name = "datePublication", nullable = false)
   @NotNull(message = "datePublication not null")
   LocalDate createdAt; //yy-mm-dd

   @Column(name = "description", nullable = false)
   @NotNull(message = "description not null")
   String description;

   @Column(name = "bestSellers", nullable = false)
   @NotNull(message = "bestSellers not null")
   Boolean bestSellers;

   @Column(name = "price", nullable = false)
   @NotNull(message = "price not null")
   BigDecimal price;

   @Column(name = "stock", nullable = false)
   @NotNull(message = "stock not null")
   Integer stock;

   @Column(name = "coverURL", nullable = false)
   @NotNull(message = "coverImage not null")
   String coverURL;

   @Column(name = "category_name", nullable = false)
   @Enumerated(EnumType.STRING)
   Category category;

   @ManyToMany
   @JoinTable(
      name = "book_author",
      joinColumns = @JoinColumn(name = "book_id"),
      inverseJoinColumns = @JoinColumn(name = "author_id")
   )
   @JsonManagedReference
   Set<Author> authors = new HashSet<>();

   @ManyToOne
   @JoinColumn(name = "editorial_id", nullable = false)
   private Editorial editorial;
}
