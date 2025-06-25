package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.rest;

import com.example.strorebooks.catalog.booksauthors.application.BookMapping;
import com.example.strorebooks.catalog.booksauthors.domain.ports.in.IBookService;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.BookRequest;
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
    public ResponseEntity<?> createBook(@RequestBody @Valid BookRequest bookRequest) {
        return ResponseEntity.ok(bookService.create(this.bookMapping.saveBookMapping(bookRequest)));
    }

    @PutMapping
    public ResponseEntity<?> updateBook(@RequestBody @Valid BookRequest bookRequest) {
        return ResponseEntity.ok(bookService.update(bookMapping.saveBookMapping(bookRequest)));
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
