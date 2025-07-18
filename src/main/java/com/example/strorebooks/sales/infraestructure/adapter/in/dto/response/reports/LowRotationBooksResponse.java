package com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class LowRotationBooksResponse {
    String isbn;
    String title;
    List<String> authors;
    Integer sales;
    String lastSold;
}
