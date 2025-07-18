package com.example.strorebooks.sales.domain.port.out.reports;

import java.math.BigDecimal;

public interface MonthlySales {
   String getMonth();
   BigDecimal getSales();
   Integer getBooksSold();
}