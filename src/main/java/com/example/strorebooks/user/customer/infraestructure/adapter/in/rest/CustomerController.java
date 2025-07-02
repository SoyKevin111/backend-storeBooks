package com.example.strorebooks.user.customer.infraestructure.adapter.in.rest;


import com.example.strorebooks.user.customer.application.UserMapping;
import com.example.strorebooks.user.customer.domain.ports.in.ICustomerService;
import com.example.strorebooks.user.customer.infraestructure.adapter.in.dto.CustomerRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storebooks/users")
public class CustomerController {

   @Autowired
   private ICustomerService userService;

   @Autowired
   private UserMapping userMapping;

   @PostMapping
   public ResponseEntity<?> createUser(@RequestBody @Valid CustomerRequest customerRequest) {
      return ResponseEntity.ok(userService.create(this.userMapping.saveUserMapping(customerRequest)));
   }

   @PutMapping
   public ResponseEntity<?> updateUser(@RequestBody @Valid CustomerRequest customerRequest) {
      return ResponseEntity.ok(userService.update(userMapping.saveUserMapping(customerRequest)));
   }

   @DeleteMapping
   public ResponseEntity<?> deleteUser(@PathVariable Long id) {
      userService.delete(id);
      return ResponseEntity.ok().build();
   }

   @GetMapping
   public ResponseEntity<?> findAllUsers() {
      return ResponseEntity.ok(userService.findAll());
   }

   @GetMapping("/{id}")
   public ResponseEntity<?> findUserById(@PathVariable Long id) {
      return ResponseEntity.ok(userService.findById(id));
   }
}
