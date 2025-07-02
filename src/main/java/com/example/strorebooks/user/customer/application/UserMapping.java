package com.example.strorebooks.user.customer.application;

import com.example.strorebooks.user.customer.infraestructure.adapter.in.dto.CustomerRequest;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import org.springframework.stereotype.Component;


@Component
public class UserMapping {

   //asignar las propiedades de CustomerRequest a Customer
   public Customer saveUserMapping(CustomerRequest customerRequest) {
      return Customer.builder()
         .id(customerRequest.getId())
         .name(customerRequest.getName())
         .lastname(customerRequest.getLastname())
         .phone(customerRequest.getPhone())
         .address(customerRequest.getAddress())
         .dateOfBirth(customerRequest.getDateOfBirth())
         .identificationNumber(customerRequest.getIdentificationNumber())
         .state(customerRequest.getState())
         .build();
   }


}
