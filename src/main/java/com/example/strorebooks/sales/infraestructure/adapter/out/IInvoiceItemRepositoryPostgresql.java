package com.example.strorebooks.sales.infraestructure.adapter.out;

import com.example.strorebooks.sales.domain.port.out.reports.BestSellersByCategory;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IInvoiceItemRepositoryPostgresql extends JpaRepository<InvoiceItem, Long> {
   @Query("""
          SELECT
              b.isbn AS isbn,
              b.title AS title,
              e.name AS editorial,
              b.price AS price,
              SUM(i.quantity) AS sales,
              b.category AS category,
              b.bestSeller AS bestSeller
          FROM InvoiceItem i
          JOIN i.book b
          JOIN b.editorial e
          GROUP BY b.id, b.isbn, b.title, b.price, b.category, b.bestSeller, e.name
          HAVING SUM(i.quantity) > 5
      """)
   List<BestSellersByCategory> findBestSellersByCategory();

}
