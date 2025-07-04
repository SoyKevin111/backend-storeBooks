package com.example.strorebooks.sales.infraestructure.adapter.in.rest;

import com.example.strorebooks.sales.application.InvoiceMapping;
import com.example.strorebooks.sales.domain.port.in.IInvoiceService;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.InvoiceRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storebooks/invoices")
public class InvoiceController {

    @Autowired
    private IInvoiceService invoiceService;

    @Autowired
    private InvoiceMapping invoiceMapping;

    @PostMapping
    public ResponseEntity<?> createInvoice(@RequestBody @Valid InvoiceRequest invoiceRequest) {
        return ResponseEntity.ok(invoiceService.create(this.invoiceMapping.saveInvoiceMapping(invoiceRequest)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateInvoice(@RequestBody @Valid InvoiceRequest invoiceRequest) {
        return ResponseEntity.ok(invoiceService.update(invoiceMapping.saveInvoiceMapping(invoiceRequest)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteInvoice(@PathVariable Long id) {
        invoiceService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> findAllInvoices() {
        return ResponseEntity.ok(invoiceService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findInvoiceById(@PathVariable Long id) {
        return ResponseEntity.ok(invoiceService.findById(id));
    }


}
