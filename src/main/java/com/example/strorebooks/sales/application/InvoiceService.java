package com.example.strorebooks.sales.application;

import com.example.strorebooks.handlerError.application.ServerInternalError;
import com.example.strorebooks.sales.domain.port.in.IInvoiceService;
import com.example.strorebooks.sales.domain.port.out.IInvoiceRepository;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class InvoiceService implements IInvoiceService {
    @Autowired
    private IInvoiceRepository invoiceRepository;

    @Override
    public Invoice create(Invoice invoicea) {
        try {
            Invoice invoice = invoiceRepository.save(invoicea);
            /*
               String codeInvoice = 'INV-00'+invoice.getId();
               invoice.setNumberInvoice(codeInvoice);
               Invoice invoiceCreated = invoiceRepository.save(invoice);
             */
            return invoiceRepository.save(invoice);
        } catch (Exception e) {
            log.error("Error creating invoice: {}", e.getMessage());
            throw new ServerInternalError("Error creating invoice");
        }
    }

    @Override
    public void delete(Long id) {
        try {
            invoiceRepository.deleteById(id);
        } catch (Exception e) {
            log.error("Error deleting invoice: {}", e.getMessage());
            throw new ServerInternalError("Error deleting invoice");
        }
    }

    @Override
    public Invoice findById(Long id) {
        try {
            return invoiceRepository.findById(id)
                .orElseThrow(() -> new ServerInternalError("Invoice not found"));
        } catch (Exception e) {
            log.error("Error finding invoice by ID: {}", e.getMessage());
            throw new ServerInternalError("Error finding invoice by ID");
        }
    }

    @Override
    public List<Invoice> findAll() {
        try {
            return invoiceRepository.findAll();
        } catch (Exception e) {
            log.error("Error finding all invoices: {}", e.getMessage());
            throw new ServerInternalError("Error finding all invoices");
        }
    }
}
