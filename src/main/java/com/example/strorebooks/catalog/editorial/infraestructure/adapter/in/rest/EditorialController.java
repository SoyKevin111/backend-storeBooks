package com.example.strorebooks.catalog.editorial.infraestructure.adapter.in.rest;


import com.example.strorebooks.catalog.editorial.application.EditorialMapping;
import com.example.strorebooks.catalog.editorial.application.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class EditorialController {

    @Autowired
    private EditorialService editorialService;

    @Autowired
    private EditorialMapping editorialMapping;

    @DeleteMapping
    public ResponseEntity<?> deleteEditorial(@PathVariable Long id) {
        editorialService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> findAllEditorials() {
        return ResponseEntity.ok(editorialService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findEditorialById(@PathVariable Long id) {
        return ResponseEntity.ok(editorialService.findById(id));
    }
}

