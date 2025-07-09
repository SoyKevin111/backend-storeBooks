package com.example.strorebooks.sales.application.mapping;

import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.InvoiceItemResponse;
import com.example.strorebooks.sales.infraestructure.adapter.in.dto.response.InvoiceResponse;
import com.example.strorebooks.sales.infraestructure.adapter.out.model.Invoice;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InvoiceResponseMapping {

   /*

   en un metodo:

   public InvoiceResponse toInvoiceResponse(Invoice invoiceLoaded) {

            List<InvoiceItem> invoiceItemsRequestList = new ArrayList<>();


         invoice.getInvoiceItems().forEach(item -> {
            new i InvoiceItemRequest();
            i.setId(item.getId());
            i.setIsbn(item.getBook().getIsbn());
            i.setBookName(item.getBook().getName());
            i.setPriceUnit(item.getBook().getPrice());
            i.setSubtotal(item.getSubtotal());
            i.setQuantity(item.getQuantity());

            invoiceItemsRequestList.add(i);

         });

         InvoiceResponse ir = new InvoiceResponse();
         ir.setId(invoiceLoaded.getId());
         ir.setCustomer(invoiceLoaded.getCustomer());//objeto de dominio
         ir.setCreatedAt(invoiceLoaded.getCreatedAt());
         ir.setNumberInvoice(invoiceLoaded.getNumberInvoice());
         ir.setIva(invoiceLoaded.getIva());
         ir.setSubtotal(invoiceLoaded.getSubtotal());
         ir.setTotal(invoiceLoaded.getTotal());
         ir.setInvoiceItems(invoiceItemsRequestList);

         return ir;

   }
    */

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
