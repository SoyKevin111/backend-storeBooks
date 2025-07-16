package com.example.strorebooks.catalog.booksauthors.application.mapping;

import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IAuthorRepository;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.AuthorRequest;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.handlerError.infraestructure.model.ErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapping {

   @Autowired
   IAuthorRepository authorRepository;

   public Author updateAuthorMapping(AuthorRequest authorRequest, Long id) {
      Author author = this.authorRepository.findById(id)
         .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Author not found with id: " + authorRequest.getId()));

      if (!author.getIdentityNumber().equals(authorRequest.getIdentityNumber())) {
         validateIdentityNumber(authorRequest.getIdentityNumber());
      }

      return Author.builder()
         .id(author.getId())
         .name(authorRequest.getName())
         .lastName(authorRequest.getLastName())
         .email(authorRequest.getEmail())
         .identityNumber(authorRequest.getIdentityNumber())
         .state(authorRequest.getState())
         .build();
   }

   public Author createAuthorMapping(AuthorRequest authorRequest) {
      validateIdentityNumber(authorRequest.getIdentityNumber());
      return Author.builder()
         .id(authorRequest.getId())
         .name(authorRequest.getName())
         .lastName(authorRequest.getLastName())
         .email(authorRequest.getEmail())
         .identityNumber(authorRequest.getIdentityNumber())
         .state(authorRequest.getState())
         .build();
   }

   public void validateIdentityNumber(String identityNumber) {
      if (this.authorRepository.existsByIdentityNumber(identityNumber)) {
         throw new ServerInternalError(ErrorType.DB_ERROR.name(), "Author with identity number " + identityNumber + " already exists");
      }
   }
}
