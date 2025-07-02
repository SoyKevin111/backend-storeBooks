package com.example.strorebooks.user.customer.infraestructure.adapter.out;

import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepositoryPostgresql extends JpaRepository<Customer, Long> {


}
