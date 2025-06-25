package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto;


import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Category;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BookRequest {
    Long id;

    @JsonProperty("ISBN")
    String ISBN;

    String title;
    String datePublication;
    Double price;
    Integer stock;
    String coverURL;
    Category category;
    List<Long> authors;
}
