package com.example.strorebooks.catalog.editorial.infraestructure.adapter.in.rest;

import com.example.strorebooks.catalog.editorial.application.EditorialMapping;
import com.example.strorebooks.catalog.editorial.domain.ports.in.IEditorialService;
import com.example.strorebooks.catalog.editorial.infraestructure.adapter.in.dto.EditorialRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storebooks/editorials")
public class EditorialController {

   @Autowired
   private IEditorialService editorialService;

   @Autowired
   private EditorialMapping editorialMapping;

   @PostMapping
   public ResponseEntity<?> createEditorial(@RequestBody @Valid EditorialRequest editorialRequest) {
      return ResponseEntity.ok(editorialService.create(editorialMapping.createEditorialMapping(editorialRequest)));
   }

   @PutMapping("/{id}")
   public ResponseEntity<?> updateEditorial(@RequestBody @Valid EditorialRequest editorialRequest, @PathVariable Long id) {
      return ResponseEntity.ok(editorialService.update(editorialMapping.updateEditorialMapping(editorialRequest, id)));
   }

   @DeleteMapping("/{id}")
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


