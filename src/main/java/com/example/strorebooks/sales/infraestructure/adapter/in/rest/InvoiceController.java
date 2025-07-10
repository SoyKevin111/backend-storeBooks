package com.example.strorebooks.sales.infraestructure.adapter.in.rest;

import com.example.strorebooks.sales.application.InvoiceService;
import com.example.strorebooks.sales.application.mapping.InvoiceMapping;
import com.example.strorebooks.sales.application.mapping.InvoiceResponseMapping;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.request.InvoiceRequest;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.InvoiceResponse;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/storebooks/invoices")
public class InvoiceController {

   /*
   @Autwired
   InvoiceMapping im;
   InvoiceService is;
   InvoiceResponseMapping irm;


     @PostMapping
     ResponseEntity<InvoiceResponse> createInvoice(@RequestBody InvoiceRequest invoiceRequest) {
         Invoice invoiceLoaded = is.createInvoice(im.saveMappingInvoiceRequestToInvoice(invoiceRequest)); // mandas no id de factura e item, recibes id factura e item
         return new ResponseEntity<>(irm.toInvoiceResponse(invoiceLoaded), HttpStatus.CREATED);
     }

     @Get

    */

    @Autowired
    private InvoiceResponseMapping invoiceResponseMapping;
    @Autowired
    private InvoiceMapping invoiceMapping;
    @Autowired
    private InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<InvoiceResponse> createInvoice(@RequestBody @Valid InvoiceRequest invoiceRequest) {
        Invoice invoice = invoiceMapping.mapToInvoice(invoiceRequest); // convierte request en entidad
        Invoice createdInvoice = invoiceService.create(invoice); // guarda en DB
        InvoiceResponse response = invoiceResponseMapping.toInvoiceResponse(createdInvoice); // respuesta al frontend

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvoiceResponse> getInvoiceById(@PathVariable Long id) {
        Invoice invoice = invoiceService.findById(id);
        InvoiceResponse response = invoiceResponseMapping.toInvoiceResponse(invoice);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<InvoiceResponse>> getAllInvoices() {
        List<Invoice> invoices = invoiceService.findAll();
        List<InvoiceResponse> responses = invoices.stream()
                .map(invoiceResponseMapping::toInvoiceResponse)
                .toList();
        return ResponseEntity.ok(responses);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInvoice(@PathVariable Long id) {
        invoiceService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
