package com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BestSellersResponse {
    private String title;
    private String category;
    private Long sales;
}
