package com.example.strorebooks.user.customer.application;

import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.handlerError.infraestructure.model.ErrorType;
import com.example.strorebooks.user.customer.infraestructure.adapter.in.dto.CustomerRequest;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerMapping {
   @Autowired
    private CustomerRepository customerRepository;

   //asignar las propiedades de CustomerRequest a Customer
   public Customer createCustomerMapping(CustomerRequest customerRequest) {
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

   public Customer updateCustomerMapping(CustomerRequest customerRequest, long id) {

      Customer customer = customerRepository.findById(id)
              .orElseThrow(() -> new ServerInternalError(ErrorType.DB_ERROR.name(), "Customer not found with id: " + id));

      return Customer.builder()
         .id(customer.getId())
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
