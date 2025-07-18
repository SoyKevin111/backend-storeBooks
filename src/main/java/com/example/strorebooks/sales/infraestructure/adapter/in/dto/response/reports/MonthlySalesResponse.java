package com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports;


import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MonthlySalesResponse {
    private String month;
    private BigDecimal sales;
    private Integer booksSold;
}