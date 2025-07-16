package com.example.strorebooks.sales.infraestructure.adapter.in.rest;


import com.example.strorebooks.sales.application.mapping.ReportsMapping;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.reports.BestSellersByCategoryResponse;
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


}
