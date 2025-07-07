package com.example.strorebooks.user.customer.infraestructure.adapter.in.rest;


import com.example.strorebooks.user.customer.application.CustomerMapping;
import com.example.strorebooks.user.customer.domain.ports.in.ICustomerService;
import com.example.strorebooks.user.customer.infraestructure.adapter.in.dto.CustomerRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storebooks/customers")
public class CustomerController {

   @Autowired
   private ICustomerService customerService;

   @Autowired
   private CustomerMapping customerMapping;

   @PostMapping
   public ResponseEntity<?> createCustomer(@RequestBody @Valid CustomerRequest customerRequest) {
      return ResponseEntity.ok(customerService.create(this.customerMapping.createCustomerMapping(customerRequest)));
   }

   @PutMapping("/{id}")
   public ResponseEntity<?> updateCustomer(@RequestBody @Valid CustomerRequest customerRequest, @PathVariable Long id) {
      return ResponseEntity.ok(customerService.update(customerMapping.updateCustomerMapping(customerRequest, id)));
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<?> deleteCustomer(@PathVariable Long id) {
      customerService.delete(id);
      return ResponseEntity.ok().build();
   }

   @GetMapping
   public ResponseEntity<?> findAllCustomer() {
      return ResponseEntity.ok(customerService.findAll());
   }

   @GetMapping("/{id}")
   public ResponseEntity<?> findCustomerById(@PathVariable Long id) {
      return ResponseEntity.ok(customerService.findById(id));
   }
}
