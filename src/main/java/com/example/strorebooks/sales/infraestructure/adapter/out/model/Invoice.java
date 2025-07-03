package com.example.strorebooks.sales.infraestructure.adapter.out.model;


import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "invoice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Invoice {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @ManyToOne
   @JoinColumn(name = "customer_id", nullable = false)
   private Customer customer;  // varios invoices pueden ser del mismo customer

   @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<InvoiceItem> items = new ArrayList<>(); // lista de ítems

   @NotNull
   @Column(name = "created_at", nullable = false)
   private LocalDateTime createdAt;

   @NotNull
   @Column(name = "iva", nullable = false, precision = 4, scale = 2)
   private BigDecimal iva;

   @NotNull
   @Column(name = "subtotal", nullable = false, precision = 10, scale = 2)
   private BigDecimal subtotal;

   @NotNull
   @Column(name = "total", nullable = false, precision = 10, scale = 2)
   private BigDecimal total;

}
