package com.example.strorebooks.sales.infraestructure.adapter.out.model;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;
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
public class InvoiceItemDetail {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @OneToMany
   @JoinColumn(name = "book_id", referencedColumnName = "id", nullable = false)
   Book book;

   @ManyToOne
   @JoinColumn(name = "book_id", referencedColumnName = "id", nullable = false)
   Invoice invoice;

   @Column(nullable = false, name = "quantity")
   @NotNull(message = "quantity not null")
   Integer quantity;

   @Column(nullable = false, name = "quantity")
   @NotNull(message = "subtotal not null")
   BigDecimal subtotal;

}
