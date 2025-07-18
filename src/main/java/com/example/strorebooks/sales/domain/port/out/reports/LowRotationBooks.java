package com.example.strorebooks.sales.domain.port.out.reports;

import java.math.BigDecimal;

public interface LowRotationBooks {
    String getIsbn();
    String getTitle();
    Integer getSales();
    String getLastSold();
}
