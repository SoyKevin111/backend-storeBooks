package com.example.strorebooks.sales.application;

import com.example.strorebooks.sales.infraestructure.adapter.out.model.InvoiceItem;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class InvoiceItemCalculationService {

   public BigDecimal calculateSubtotal(BigDecimal price, BigDecimal quantity) {
      return quantity.multiply(price);
   }

   public void updateTotals(InvoiceItem invoiceItem) {
      BigDecimal bookPrice = invoiceItem.getBook().getPrice();
      BigDecimal quantity = new BigDecimal(invoiceItem.getQuantity());
      BigDecimal subtotal = calculateSubtotal(bookPrice, quantity);
      invoiceItem.setSubtotal(subtotal);
   }

}
