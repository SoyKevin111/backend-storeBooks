package com.example.strorebooks.sales.infraestructure.adapter.out.model;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "invoice_item_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvoiceItem {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @ManyToOne
   @JoinColumn(name = "book_id", nullable = false)
   private Book book;  // cada ítem tiene un libro asociado

   @ManyToOne
   @JoinColumn(name = "invoice_id", nullable = false)
   @JsonIgnore
   private Invoice invoice; // cada ítem pertenece a una factura

   @Column(nullable = false)
   @NotNull(message = "quantity not null")
   private Integer quantity;

   @Column(nullable = false, precision = 10, scale = 2)
   @NotNull(message = "subtotal not null")
   private BigDecimal subtotal;

}
