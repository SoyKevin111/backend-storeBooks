package com.example.strorebooks.user.customer.domain.ports.out;

import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerRepository {
   Customer save(Customer customer);
   void deleteById(Long id);
   Optional<Customer> findById(Long id);
   List<Customer> findAll();
   boolean existsByIdentificationNumber(String identificationNumber);
}
