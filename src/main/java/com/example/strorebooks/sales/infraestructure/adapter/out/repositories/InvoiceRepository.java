package com.example.strorebooks.sales.infraestructure.adapter.out.repositories;

import com.example.strorebooks.sales.domain.port.out.IInvoiceRepository;
import com.example.strorebooks.sales.infraestructure.adapter.out.IInvoiceRepositoryPostgresql;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InvoiceRepository implements IInvoiceRepository {
    @Autowired
    private IInvoiceRepositoryPostgresql repository;


    @Override
    public Invoice save(Invoice invoice) {
        return this.repository.save(invoice);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<Invoice> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Invoice> findById(long id) {
        return this.repository.findById(id);
    }
}
