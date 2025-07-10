package com.example.strorebooks.sales.infraestructure.adapter.in.dto.response;

import com.example.strorebooks.user.customer.infraestructure.adapter.out.model.Customer;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceResponse {

   /*

   export class Invoice {
	numberInvoice:string = ''; //OJOOOOOO
	customer: Customer = {
	    ...
	};
	createdAt: string = '';
	iva: number = 15;
	subtotal: number = 0;
	total: number = 0;
	items: InvoiceItemDetails[] = [];
}

    */
    private Long id;
    private String numberInvoice;
    private Customer customer;
    private LocalDateTime createdAt;
    private BigDecimal iva;
    private BigDecimal subtotal;
    private BigDecimal total;
    private List<InvoiceItemResponse> items;
}
