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
public class InvoiceItemResponse {

   /*



export class InvoiceItemDetails {
	id: number = 0;
	isbn: string = '';
	bookName: string = '';
	priceUnit: number = 0;
	subtotal: number = 0;
	quantity: number = 0;
}
    */

    private Long id;
    private String isbn;
    private String bookName;
    private BigDecimal priceUnit;
    private BigDecimal subtotal;
    private Integer quantity;
}
