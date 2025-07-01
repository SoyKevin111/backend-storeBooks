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
   Long id;

   @OneToMany
   @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
   Customer customer;

   @OneToMany(mappedBy = "invoice", cascade = CascadeType.PERSIST, orphanRemoval = true)
   private List<InvoiceItemDetail> items = new ArrayList<>();

   @NotNull(message = "createdAt must not be null")
   @Column(name = "created_at", nullable = false)
   private LocalDateTime createdAt;

   @NotNull(message = "IVA must not be null")
   @Column(name = "iva", nullable = false, precision = 4, scale = 2) // ej: 0.15
   private BigDecimal iva = new BigDecimal("0.15");

   @NotNull(message = "Subtotal must not be null")
   @Column(name = "subtotal", nullable = false, precision = 10, scale = 2) // ej: 99999999.99
   private BigDecimal subtotal;

   @NotNull(message = "Total must not be null")
   @Column(name = "total", nullable = false, precision = 10, scale = 2)
   private BigDecimal total;

}
