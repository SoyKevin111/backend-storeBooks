package com.example.strorebooks.sales.application;

import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.InvoiceItem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Service
public class InvoiceCalculationService {

   private static final BigDecimal IVA_RATE = new BigDecimal("0.15");


   public BigDecimal calculateSubtotal(List<InvoiceItem> items) {
      return items.stream()
         .map(item -> item.getSubtotal())
         .reduce(BigDecimal.ZERO, (a, b) -> a.add(b));
   }


   public BigDecimal calculateIva(BigDecimal subtotal) {
      return subtotal.multiply(IVA_RATE).setScale(2, RoundingMode.HALF_UP);
   }


   public BigDecimal calculateTotal(BigDecimal subtotal, BigDecimal iva) {
      return subtotal.add(iva).setScale(2, RoundingMode.HALF_UP);
   }


   public void updateTotals(Invoice invoice) {
      BigDecimal subtotal = calculateSubtotal(invoice.getItems());
      BigDecimal iva = calculateIva(subtotal);
      BigDecimal total = calculateTotal(subtotal, iva);

      invoice.setSubtotal(subtotal);
      invoice.setIva(iva);
      invoice.setTotal(total);
   }
}

