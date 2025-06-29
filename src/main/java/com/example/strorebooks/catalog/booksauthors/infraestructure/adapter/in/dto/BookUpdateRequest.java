package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Category;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BookUpdateRequest {

   @NotBlank(message = "Title must not be null or empty")
   @Size(max = 30, message = "Title must not exceed 30 characters")
   String title;

   @NotBlank(message = "description must not be null or empty")
   @Size(max = 100, message = "description must not exceed 100 characters")
   String description;

   @NotNull(message = "bestSeller not null")
   Boolean bestSellers;

   @NotNull(message = "Price must not be null")
   @Min(value = 1, message = "price must be 1 or greater")
   BigDecimal price;

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
