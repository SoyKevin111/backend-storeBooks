package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.rest;

import com.example.strorebooks.catalog.booksauthors.application.mapping.BookMapping;
import com.example.strorebooks.catalog.booksauthors.domain.ports.in.IBookService;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.BookCreateRequest;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.BookUpdateRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storebooks/books")

public class BookController {

   @Autowired
   private IBookService bookService;

   @Autowired
   private BookMapping bookMapping;

   @PostMapping
   public ResponseEntity<?> createBook(@RequestBody @Valid BookCreateRequest bookCreateRequest) {
      return ResponseEntity.ok(bookService.create(this.bookMapping.createBookMapping(bookCreateRequest)));
   }

   @PutMapping("/{id}")
   public ResponseEntity<?> updateBook(@RequestBody @Valid BookUpdateRequest bookCreateRequest, @PathVariable Long id) {
      return ResponseEntity.ok(bookService.update(bookMapping.updateBookMapping(bookCreateRequest, id)));
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<?> deleteBook(@PathVariable Long id) {
      bookService.delete(id);
      return ResponseEntity.ok().build();
   }

   @GetMapping
   public ResponseEntity<?> findAllBooks() {
      return ResponseEntity.ok(bookService.findAll());
   }

   @GetMapping("/{id}")
   public ResponseEntity<?> findBookById(@PathVariable Long id) {
      return ResponseEntity.ok(bookService.findById(id));

   }
}
