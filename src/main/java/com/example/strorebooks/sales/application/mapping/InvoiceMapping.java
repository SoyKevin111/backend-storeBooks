package com.example.strorebooks.sales.application.mapping;

import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.model.Book;
import com.example.strorebooks.catalog.booksauthors.infraestructure.adapter.out.repositories.BookRepository;
import com.example.strorebooks.sales.application.calculation.InvoiceCalculationService;
import com.example.strorebooks.sales.application.calculation.InvoiceItemCalculationService;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.request.InvoiceItemRequest;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.request.InvoiceRequest;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.InvoiceItem;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import com.example.strorebooks.user.customer.infraestructure.adapter.out.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InvoiceMapping {

   @Autowired
   private BookRepository bookRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private InvoiceItemCalculationService itemCalcService;

    @Autowired
    private InvoiceCalculationService invoiceCalcService;

    public Invoice mapToInvoice(final InvoiceRequest invoiceRequest) {

        Customer customer = customerRepository.findById(invoiceRequest.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        List<InvoiceItem> items = invoiceRequest.getItemsRequest().stream()
                .map(this::mapToInvoiceItem)
                .collect(Collectors.toList());

        Invoice invoice = Invoice.builder()
                .customer(customer)
                .items(items)
                .createdAt(LocalDateTime.now())
                .build();

        // Relación inversa: cada item apunta a la factura
        items.forEach(item -> item.setInvoice(invoice));

        // Cálculo de subtotal, IVA y total
        invoiceCalcService.updateTotals(invoice);

        return invoice;
    }

    private InvoiceItem mapToInvoiceItem(final InvoiceItemRequest request) {

        Book book = bookRepository.findById(request.getBookId())
                .orElseThrow(() -> new RuntimeException("Book not found"));

        if (book.getStock() < request.getQuantity()) {
            throw new RuntimeException("Stock insuficiente para el libro: " + book.getTitle());
        }

        // Actualizar stock y persistir
        book.setStock(book.getStock() - request.getQuantity());
        bookRepository.save(book);

        InvoiceItem item = InvoiceItem.builder()
                .book(book)
                .quantity(request.getQuantity())
                .build();

        // Calcula subtotal del ítem (precio x cantidad)
        itemCalcService.updateTotals(item);

        return item;
    }
}