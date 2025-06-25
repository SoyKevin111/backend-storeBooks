package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.State;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AuthorRequest {
    Long id;
    String name;
    String lastname;
    String email;
    String numberIdentification;
    State state;
}
