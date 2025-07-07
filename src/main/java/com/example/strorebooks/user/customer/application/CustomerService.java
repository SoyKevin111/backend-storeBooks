package com.example.strorebooks.user.customer.application;

import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.user.customer.domain.ports.in.ICustomerService;
import com.example.strorebooks.user.customer.domain.ports.out.ICustomerRepository;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerService implements ICustomerService {

   @Autowired
   ICustomerRepository customerRepository;

   @Override
   public Customer create(Customer customer) {
      try {
         return customerRepository.save(customer);
      } catch (Exception e) {
         log.error("Error creating customer: {}", e.getMessage());
         throw new ServerInternalError("Error creating customer");
      }
   }

   @Override
   public Customer update(Customer customer) {
      try {
         return customerRepository.save(customer);
      } catch (Exception e) {
         log.error("Error updating customer: {}", e.getMessage());
         throw new ServerInternalError("Error updating customer");
      }
   }

   @Override
   public void delete(Long id) {
      if (customerRepository.findById(id).isEmpty()) {
         throw new ServerInternalError("Error deleting customer: customer not found");
      }
      try {
         customerRepository.deleteById(id);
      } catch (Exception e) {
         log.error("Error deleting customer: {}", e.getMessage());
         throw new ServerInternalError("Error deleting customer");
      }
   }

   @Override
   public Customer findById(Long id) {
      try {
         return customerRepository.findById(id)
            .orElseThrow(() -> new ServerInternalError("customer not found"));
      } catch (Exception e) {
         log.error("Error finding customer by id: {}", e.getMessage());
         throw new ServerInternalError("Error finding customer by id");
      }
   }

   @Override
   public List<Customer> findAll() {
      try {
         return customerRepository.findAll();
      } catch (Exception e) {
         log.error("Error finding alls customers: {}", e.getMessage());
         throw new ServerInternalError("Error finding all customers");
      }
   }
}
