package com.example.strorebooks.user.admin.infraestructure.adapter.in.rest;

import com.example.strorebooks.user.admin.application.AdministratorMapping;
import com.example.strorebooks.user.admin.domain.ports.in.IAdministratorService;
import com.example.strorebooks.user.admin.infraestructure.adapter.in.dto.AdministratorRequest;
import com.example.strorebooks.user.admin.infraestructure.adapter.in.dto.TokenResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storebooks/administrators")
public class AdministratorController {

   @Autowired
   private IAdministratorService administratorService;

   @Autowired
   private AdministratorMapping administratorMapping;

   @PostMapping
   public ResponseEntity<?> createAdministrator(@RequestBody @Valid AdministratorRequest request) {
      return ResponseEntity.ok(administratorService.create(administratorMapping.createAdministratorMapping(request)));
   }

   @PutMapping("/{id}")
   public ResponseEntity<?> updateAdministrator(@RequestBody @Valid AdministratorRequest request, @PathVariable Long id) {
      return ResponseEntity.ok(administratorService.update(administratorMapping.updateAdministratorMapping(request, id)));
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<?> deleteAdministrator(@PathVariable Long id) {
      administratorService.delete(id);
      return ResponseEntity.ok().build();
   }

   @GetMapping
   public ResponseEntity<?> findAllAdministrators() {
      return ResponseEntity.ok(administratorService.findAll());
   }

   @GetMapping("/{id}")
   public ResponseEntity<?> findAdministratorById(@PathVariable Long id) {
      return ResponseEntity.ok(administratorService.findById(id));
   }

   @GetMapping("/login")
   public ResponseEntity<TokenResponse> login(@RequestParam String username, @RequestParam String password) {
      return ResponseEntity.ok(this.administratorMapping.loginMapping(username, password));
   }
}
