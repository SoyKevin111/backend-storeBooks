package com.example.strorebooks.sales.application.mapping;

import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.InvoiceItemResponse;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.InvoiceResponse;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InvoiceResponseMapping {


    public InvoiceResponse toInvoiceResponse(Invoice invoice) {
        List<InvoiceItemResponse> itemResponses = invoice.getItems().stream()
                .map(item -> InvoiceItemResponse.builder()
                        .id(item.getId())
                        .isbn(item.getBook().getIsbn())
                        .bookName(item.getBook().getTitle())
                        .priceUnit(item.getBook().getPrice())
                        .subtotal(item.getSubtotal())
                        .quantity(item.getQuantity())
                        .build())
                .collect(Collectors.toList());

        return InvoiceResponse.builder()
                .id(invoice.getId())
                .customer(invoice.getCustomer()) // Puedes usar un CustomerDTO si prefieres no exponer la entidad
                .createdAt(invoice.getCreatedAt())
                .numberInvoice(invoice.getNumberInvoice())
                .subtotal(invoice.getSubtotal())
                .iva(invoice.getIva())
                .total(invoice.getTotal())
                .items(itemResponses)
                .build();
    }

}
