package com.example.strorebooks.sales.infraestructure.adapter.out.repositories;

import com.example.strorebooks.sales.domain.port.out.reports.BestSellersByCategory;
import com.example.strorebooks.sales.domain.port.out.IInvoiceItemRepository;
import com.example.strorebooks.sales.infraestructure.adapter.out.IInvoiceItemRepositoryPostgresql;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.InvoiceItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InvoiceItemRepository implements IInvoiceItemRepository {

   @Autowired
   IInvoiceItemRepositoryPostgresql repository;

   @Override
   public InvoiceItem save(InvoiceItem invoiceItem) {
      return null;
   }

   @Override
   public void deleteById(Long id) {

   }

   @Override
   public Optional<InvoiceItem> findById(Long invoiceId) {
      return Optional.empty();
   }

   @Override
   public List<InvoiceItem> findAll() {
      return List.of();
   }

   @Override
   public List<BestSellersByCategory> findBestSellersByCategory() {
      return this.repository.findBestSellersByCategory();
   }
}
