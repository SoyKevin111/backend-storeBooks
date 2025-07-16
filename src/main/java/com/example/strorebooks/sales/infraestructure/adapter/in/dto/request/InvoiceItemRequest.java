package com.example.strorebooks.sales.infraestructure.adapter.in.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceItemRequest {
   @NotNull(message = "BookId must not be null")
   Long bookId;

   @NotNull(message = "Quantity must not be null")
   @Min(value = 1, message = "Quantity must be at least 1")
   Integer quantity;

}
