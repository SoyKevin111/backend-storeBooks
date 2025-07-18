package com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BestSellersByCategoryResponse {
   String isbn;
   String title;
   List<String> authors;
   String editorial;
   BigDecimal price;
   Integer sales;
   String category;
   Boolean bestSeller;
}
