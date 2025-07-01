package com.example.strorebooks.user.customer.domain.ports.in;

import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;

import java.util.List;

public interface IUserService {

   Customer create(Customer customer);
   Customer update(Customer customer);
   void delete(Long id);
   Customer findById(Long id);
   List<Customer> findAll();


}
