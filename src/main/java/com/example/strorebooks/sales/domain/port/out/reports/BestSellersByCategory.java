package com.example.strorebooks.sales.domain.port.out.reports;

import java.math.BigDecimal;

public interface BestSellersByCategory {
   String getIsbn();
   String getTitle();
   String getEditorial();
   BigDecimal getPrice();
   Integer getSales();
   String getCategory();
   Boolean getBestSeller();
}
