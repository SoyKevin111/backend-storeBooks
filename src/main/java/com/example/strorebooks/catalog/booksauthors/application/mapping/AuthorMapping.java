package com.example.strorebooks.catalog.booksauthors.application.mapping;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.AuthorRequest;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapping {
    public Author saveAuthorMapping(AuthorRequest authorRequest) {
        return Author.builder()
                .id(authorRequest.getId())
                .name(authorRequest.getName())
                .lastname(authorRequest.getLastname())
                .email(authorRequest.getEmail())
                .numberIdentification(authorRequest.getNumberIdentification())
                .state(authorRequest.getState())
                .build();
    }
}
