package com.example.strorebooks.sales.infraestructure.adapter.in.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class InvoiceRequest {
    @NotNull(message = "Invoice items must not be null")
    @NotBlank(message = "Customer must not be null or empty")
    @Size(max = 50, message = "Customer name must not exceed 50 characters")
    String customerId;
    List<InvoiceItemRequest> itemsRequest;
}
