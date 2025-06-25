package com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.rest;

import com.example.strorebooks.catalog.booksauthors.application.BookMapping;
import com.example.strorebooks.catalog.booksauthors.domain.ports.in.IBookService;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.in.dto.BookRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
