package com.example.strorebooks.sales.domain.port.out;

import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;

import java.util.List;
import java.util.Optional;

public interface IInvoiceRepository {

    Invoice save(Invoice invoice);
    void deleteById(Long id);
    List<Invoice> findAll();
    Optional<Invoice> findById(long id);

}
