package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto;


import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Category;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BookRequest {

    Long id;

    @NotBlank(message = "ISBN must not be null or empty")
    @Size(max = 20, message = "ISBN must not exceed 20 characters")
    String isbn;

    @NotBlank(message = "Title must not be null or empty")
    @Size(max = 50, message = "Title must not exceed 50 characters")
    String title;

    @NotBlank(message = "Publication date must not be null or empty")
    @Size(max = 12, message = "Publication date must not exceed 12 characters")
    String datePublication;

    @NotNull(message = "Price must not be null")
    Double price;

    @NotNull(message = "Stock must not be null")
    @Min(value = 0, message = "Stock must be 0 or greater")
    Integer stock;

    @NotBlank(message = "Cover URL must not be null or empty")
    @Size(max = 255, message = "Cover URL must not exceed 255 characters")
    String coverURL;

    @NotNull(message = "Category must not be null")
    Category category;

    @NotNull(message = "Authors must not be null")
    List<Long> authors;

    @NotNull(message = "Editorial ID must not be null")
    Long editorialId;
}
