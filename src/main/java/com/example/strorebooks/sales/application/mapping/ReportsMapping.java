package com.example.strorebooks.sales.application.mapping;

import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IAuthorRepository;
import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IBookRepository;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Author;
import com.example.strorebooks.sales.domain.port.out.IInvoiceItemRepository;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.BestSellersByCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportsMapping {

   @Autowired
   IInvoiceItemRepository invoiceItemRepository;
   @Autowired
   IBookRepository bookRepository;

   public List<BestSellersByCategoryResponse> toBestSellersByCategoryResponse() {

      return invoiceItemRepository.findBestSellersByCategory().stream()
         .map(item -> {

            List<String> authors = this.bookRepository.findAuthorsByBookIsbn(item.getIsbn()).stream().map(
               a -> {
                  return a.getName() + " " + a.getLastName();
               }).toList();

            return BestSellersByCategoryResponse.builder()
               .isbn(item.getIsbn())
               .title(item.getTitle())
               .editorial(item.getEditorial())
               .authors(authors)
               .price(item.getPrice())
               .category(item.getCategory())
               .bestSeller(item.getBestSeller())
               .sales(item.getSales())
               .build();
         })
         .toList();
   }


}
