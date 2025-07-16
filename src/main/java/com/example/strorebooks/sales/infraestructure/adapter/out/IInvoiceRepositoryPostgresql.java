package com.example.strorebooks.sales.infraestructure.adapter.out;

import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceRepositoryPostgresql extends JpaRepository<Invoice, Long> {

}
