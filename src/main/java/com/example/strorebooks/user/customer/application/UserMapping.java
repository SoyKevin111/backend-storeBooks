package com.example.strorebooks.user.customer.application;

import com.example.strorebooks.user.customer.infraestructure.adapter.in.dto.UserRequest;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import org.springframework.stereotype.Component;


@Component
public class UserMapping {

   //asignar las propiedades de UserRequest a User
   public Customer saveUserMapping(UserRequest userRequest) {
      return Customer.builder()
         .id(userRequest.getId())
         .name(userRequest.getName())
         .lastname(userRequest.getLastname())
         .phone(userRequest.getPhone())
         .address(userRequest.getAddress())
         .dateOfBirth(userRequest.getDateOfBirth())
         .identificationNumber(userRequest.getIdentificationNumber())
         .state(userRequest.getState())
         .build();
   }


}
