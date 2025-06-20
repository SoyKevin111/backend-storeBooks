package com.example.strorebooks.user.application;

import com.example.strorebooks.user.domain.ports.out.IUserRepository;
import com.example.strorebooks.user.infraestructure.adapter.in.dto.UserRequest;
import com.example.strorebooks.user.infraestructure.adapter.out.model.Role;
import com.example.strorebooks.user.infraestructure.adapter.out.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserMapping {

   @Autowired
   IRoleRepository

   public User userCreateMapping(UserRequest userRequest) {
      Role role = this.roleRepository.findByName(userRequest.getRoleName())
            .orElseThrow(() -> new RuntimeException("Role not found"));

      return User.builder()
         .name()
         .role(role)
         .build();
   }
}
