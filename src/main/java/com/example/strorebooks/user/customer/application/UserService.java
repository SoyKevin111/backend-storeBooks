package com.example.strorebooks.user.customer.application;

import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.user.customer.domain.ports.in.IUserService;
import com.example.strorebooks.user.customer.domain.ports.out.IUserRepository;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService implements IUserService {

   @Autowired
   IUserRepository userRepository;

   @Override
   public Customer create(Customer customer) {
      try {
         customer.setId(null); //ID es null para nuevos usuarios
         return userRepository.save(customer);
      } catch (Exception e) {
         log.error("Error creating user: {}", e.getMessage());
         throw new ServerInternalError("Error creating user");
      }
   }

   @Override
   public Customer update(Customer customer) {
      try {
         if (customer.getId() == null) {
            throw new ServerInternalError("User ID must not be null for update");
         }
         return userRepository.save(customer);
      } catch (Exception e) {
         log.error("Error updating user: {}", e.getMessage());
         throw new ServerInternalError("Error updating user");
      }
   }

   @Override
   public void delete(Long id) {
      try {
         userRepository.deleteById(id);
      } catch (Exception e) {
         log.error("Error deleting user: {}", e.getMessage());
         throw new ServerInternalError("Error deleting user");
      }
   }

   @Override
   public Customer findById(Long id) {
      try {
         return userRepository.findById(id)
            .orElseThrow(() -> new ServerInternalError("User not found"));
      } catch (Exception e) {
         log.error("Error finding user by id: {}", e.getMessage());
         throw new ServerInternalError("Error finding user by id");
      }
   }

   @Override
   public List<Customer> findAll() {
      try {
         return userRepository.findAll();
      } catch (Exception e) {
         log.error("Error finding alls users: {}", e.getMessage());
         throw new ServerInternalError("Error finding all users");
      }
   }
}
