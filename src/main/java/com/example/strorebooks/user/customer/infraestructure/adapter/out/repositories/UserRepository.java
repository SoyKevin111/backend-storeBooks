package com.example.strorebooks.user.customer.infraestructure.adapter.out.repositories;

import com.example.strorebooks.user.customer.domain.ports.out.IUserRepository;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.IUserRepositoryPostgresql;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements IUserRepository {

   @Autowired
   private IUserRepositoryPostgresql repository;

   @Override
   public Customer save(Customer customer) {
      return this.repository.save(customer);
   }

   @Override
   public void deleteById(Long id) {
      this.repository.deleteById(id);
   }

   @Override
   public Optional<Customer> findById(Long id) {
      return this.repository.findById(id);
   }

   @Override
   public List<Customer> findAll() {
      return this.repository.findAll();
   }
}
