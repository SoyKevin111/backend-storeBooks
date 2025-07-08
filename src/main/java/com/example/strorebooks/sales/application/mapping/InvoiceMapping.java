package com.example.strorebooks.sales.application.mapping;

public class InvoiceMapping {

   /*

   @Autowired
   InvoiceItemCalculationService calculationItemService;

   @Autowired
   InvoiceCalculationService calculationInvoiceService;

   //repositoryBook

   Item saveMappingInvoiceItem(InvoiceItemRequest invoiceItemRequest){
    // new InvoiceItem()

    // buscas y asignas el libro, verficacion de stock disponible, si esta disponible compras sino lanzas una excepcion
    //si esta disponible actualizas la cantidad del libro = bookLoaded.setQuantity(bookLoaded.getQuantity() - invoiceItemRequest.getQuantity());

    // asignas cantidad del request al new invoiceItem

    calculationItemService.updateTotals(newInvoiceItem);

   return newInvoiceItem;
   }

------------

   Invoice saveMappingInvoice(InvoiceRequest invoiceRequest){

        new Invoice();
        List<InvoiceItem> newInvoiceItems = invoiceRequest.getItems().stream().map(
         item -> saveMappingInvoiceItem(item)
        ).collect(Collectors.toList());
         invoice.setInvoiceItems(newInvoiceItems);
         //asignas el customer
         //para la fecha invoice.setCreatedAt(LocalDateTime.now());
         //para el iva invoice.setIva(calculationInvoiceService.getIvaRate());
         // para el total y subtotal =
         calculationInvoiceService.updateTotals(invoice);
         return invoice;
   }


Book bookLoaded = bookRepository.findById(...).orElseThrow(...);

// Verificación de stock
if (bookLoaded.getQuantity() < invoiceItemRequest.getQuantity()) {
    throw new RuntimeException("Stock insuficiente");
}

// Actualizar stock
bookLoaded.setQuantity(bookLoaded.getQuantity() - invoiceItemRequest.getQuantity());
bookRepository.save(bookLoaded); // ⬅️ Necesario para persistir el cambio

*/


}