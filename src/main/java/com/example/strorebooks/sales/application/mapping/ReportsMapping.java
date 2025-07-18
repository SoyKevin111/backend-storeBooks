package com.example.strorebooks.sales.application.mapping;

import com.example.strorebooks.catalog.booksauthors.domain.ports.out.IBookRepository;
import com.example.strorebooks.sales.domain.port.out.IInvoiceItemRepository;
import com.example.strorebooks.sales.domain.port.out.reports.MonthlySales;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.BestSellersByCategoryResponse;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.BestSellersResponse;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.LowRotationBooksResponse;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.MonthlySalesResponse;
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

    public List<LowRotationBooksResponse> toLowRotationBooksResponse() {
        return invoiceItemRepository.findLowRotationBooks().stream()
                .map(item -> {
                    List<String> authors = bookRepository.findAuthorsByBookIsbn(item.getIsbn()).stream()
                            .map(a -> a.getName() + " " + a.getLastName())
                            .toList();

                    return LowRotationBooksResponse.builder()
                            .isbn(item.getIsbn())
                            .title(item.getTitle())
                            .authors(authors)
                            .sales(item.getSales())
                            .lastSold(item.getLastSold()) // formato 'YYYY-MM-DD'
                            .build();
                }).toList();
    }

    public List<MonthlySalesResponse> toMonthlySalesResponse() {
        return invoiceItemRepository.findMonthlySales().stream()
                .map(item -> MonthlySalesResponse.builder()
                        .month(item.getMonth())
                        .sales(item.getSales())
                        .booksSold(item.getBooksSold())
                        .build())
                .toList();
        }
    public List<BestSellersResponse> toBestSellersResponse() {
        return invoiceItemRepository.findBestSellers().stream()
                .map(item -> BestSellersResponse.builder()
                        .title(item.getTitle())
                        .category(item.getCategory())
                        .sales(item.getSales())
                        .build())
                .toList();
    }

}
