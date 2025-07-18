package com.example.strorebooks.sales.infraestructure.adapter.in.rest;


import com.example.strorebooks.sales.application.mapping.ReportsMapping;
import com.example.strorebooks.sales.domain.port.out.reports.MonthlySales;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.BestSellersByCategoryResponse;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.BestSellersResponse;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.LowRotationBooksResponse;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.MonthlySalesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/storebooks/reports")
public class ReportsController {

   @Autowired
   ReportsMapping reportsMapping;

   @GetMapping("/best-sellers-by-category")
   public ResponseEntity<?> bestSellersByCategory() {
      List<BestSellersByCategoryResponse> response = reportsMapping.toBestSellersByCategoryResponse();
      return ResponseEntity.ok(response);
   }

   @GetMapping("/low-rotation-books")
   public ResponseEntity<?> getLowRotationBooks() {
      List<LowRotationBooksResponse> response = reportsMapping.toLowRotationBooksResponse();
      return ResponseEntity.ok(response);
   }

   @GetMapping("/monthly-sales")
   public ResponseEntity<?> getMonthlySales() {
      return ResponseEntity.ok(reportsMapping.toMonthlySalesResponse());
   }


   @GetMapping("/best-sellers")
   public ResponseEntity<?> getBestSellers() {
      return ResponseEntity.ok(reportsMapping.toBestSellersResponse());
   }







}
