package com.example.strorebooks.sales.infraestructure.adapter.out;

import com.example.strorebooks.sales.domain.port.out.reports.BestSellers;
import com.example.strorebooks.sales.domain.port.out.reports.BestSellersByCategory;
import com.example.strorebooks.sales.domain.port.out.reports.LowRotationBooks;
import com.example.strorebooks.sales.domain.port.out.reports.MonthlySales;
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

   @Query("""
            SELECT
                 b.isbn AS isbn,
                 b.title AS title,
                 COUNT(i.id) AS sales,
                 TO_CHAR(MAX(i.invoice.createdAt), 'YYYY-MM-DD') AS lastSold
            FROM InvoiceItem i
            JOIN i.book b
            GROUP BY b.isbn, b.title
            HAVING COUNT(i.id) <= 3
      """)
   List<LowRotationBooks> findLowRotationBooks();

   @Query("""
          SELECT 
              TO_CHAR(i.invoice.createdAt, 'YYYY-MM') AS month,
              SUM(b.price * i.quantity) AS sales,
              SUM(i.quantity) AS booksSold
          FROM InvoiceItem i
          JOIN i.book b
          GROUP BY TO_CHAR(i.invoice.createdAt, 'YYYY-MM')
          ORDER BY month
      """)
   List<MonthlySales> findMonthlySales();


   @Query("""
          SELECT 
              b.title AS title,
              b.category AS category,
              SUM(i.quantity) AS sales
          FROM InvoiceItem i
          JOIN i.book b
          WHERE b.bestSeller = true
          GROUP BY b.title, b.category
          ORDER BY sales DESC
      """)
   List<BestSellers> findBestSellers();


}
