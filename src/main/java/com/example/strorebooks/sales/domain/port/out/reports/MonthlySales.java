package com.example.strorebooks.sales.domain.port.out.reports;

public interface MonthlySales {
   Integer getMonth();
   Double getSales();
   Long getBooksSold();
}
