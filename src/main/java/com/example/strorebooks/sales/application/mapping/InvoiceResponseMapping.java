package com.example.strorebooks.sales.application.mapping;

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
}
