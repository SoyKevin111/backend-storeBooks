package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.rest;

import com.example.strorebooks.catalog.booksauthors.application.mapping.AuthorMapping;
import com.example.strorebooks.catalog.booksauthors.domain.ports.in.IAuthorService;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.AuthorRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storebooks/authors")
public class AuthorController {
   @Autowired
   private IAuthorService authorService;

   @Autowired
   private AuthorMapping authorMapping;

   @PostMapping
   public ResponseEntity<?> createAuthor(@RequestBody @Valid AuthorRequest authorRequest) {
      return ResponseEntity.ok(authorService.create(this.authorMapping.createAuthorMapping(authorRequest)));
   }

   @PutMapping("/{id}")
   public ResponseEntity<?> updateAuthor(@RequestBody @Valid AuthorRequest authorRequest, @PathVariable Long id) {
      authorRequest.setId(id);
      return ResponseEntity.ok(authorService.update(authorMapping.updateAuthorMapping(authorRequest, id)));
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<?> deleteAuthor(@PathVariable Long id) {
      authorService.delete(id);
      return ResponseEntity.ok().build();
   }

   @GetMapping
   public ResponseEntity<?> findAllAuthors() {
      return ResponseEntity.ok(authorService.findAll());
   }

   @GetMapping("/{id}")
   public ResponseEntity<?> findAuthorById(@PathVariable Long id) {
      return ResponseEntity.ok(authorService.findById(id));
   }
}
