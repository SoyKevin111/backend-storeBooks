package com.example.strorebooks.sales.domain.port.out;

import com.example.strorebooks.sales.domain.port.out.reports.BestSellersByCategory;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.InvoiceItem;

import java.util.List;
import java.util.Optional;

public interface IInvoiceItemRepository {
   InvoiceItem save(InvoiceItem invoiceItem);
   void deleteById(Long id);
   Optional<InvoiceItem> findById(Long invoiceId);
   List<InvoiceItem> findAll();
   List<BestSellersByCategory> findBestSellersByCategory();
}
