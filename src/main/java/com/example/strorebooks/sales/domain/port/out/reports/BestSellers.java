package com.example.strorebooks.sales.domain.port.out.reports;

public interface BestSellers {
    String getTitle();
    String getCategory();
    Long getSales();
}
