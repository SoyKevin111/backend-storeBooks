package com.example.strorebooks.user.infraestructure.adapter.in.rest;


import com.example.strorebooks.user.application.UserMapping;
import com.example.strorebooks.user.domain.ports.in.IUserService;
import com.example.strorebooks.user.infraestructure.adapter.in.dto.UserRequest;
import com.example.strorebooks.user.infraestructure.adapter.out.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

   @Autowired
   private IUserService userService;

   @Autowired
   private UserMapping userMapping;

   @PostMapping()
   public ResponseEntity<?> createUser(@RequestBody UserRequest userRequest) {
      User user = userMapping.userCreateMapping(userRequest);
      return ResponseEntity.ok(userService.create(user));
   }

   @PostMapping("/update")
   public ResponseEntity<?> updateUser(@RequestBody User user) {
      return ResponseEntity.ok(userService.update(user));
   }

   @PostMapping("/delete")
   public ResponseEntity<?> deleteUser(@RequestBody Long id) {
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
