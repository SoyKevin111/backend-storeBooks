package com.example.strorebooks.sales.domain.port.in;

import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;

import java.util.List;

public interface IInvoiceService {
    Invoice create(Invoice invoice);
    void delete(Long id);
    Invoice findById(Long id);
    List<Invoice> findAll();
}
