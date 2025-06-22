package com.example.strorebooks.user.application;

import com.example.strorebooks.user.infraestructure.adapter.in.dto.UserRequest;
import com.example.strorebooks.user.infraestructure.adapter.out.model.User;
import org.springframework.stereotype.Component;


@Component
public class UserMapping {

   //asignar las propiedades de UserRequest a User
   public User saveUserMapping(UserRequest userRequest) {
      return User.builder()
         .id(userRequest.getId())
         .name(userRequest.getName())
         .lastname(userRequest.getLastname())
         .username(userRequest.getUsername())
         .phone(userRequest.getPhone())
         .address(userRequest.getAddress())
         .dateOfBirth(userRequest.getDateOfBirth())
         .identificationNumber(userRequest.getIdentificationNumber())
         .state(userRequest.getState())
         .role(userRequest.getRole())
         .build();
   }


}
