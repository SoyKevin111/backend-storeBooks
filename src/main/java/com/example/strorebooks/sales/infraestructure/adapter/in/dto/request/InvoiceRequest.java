package com.example.strorebooks.sales.infraestructure.adapter.in.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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


    @NotNull(message = "CustomerId must not be null")
    Long customerId;

    @JsonProperty("items")
    @NotNull(message = "Invoice items must not be null")
    @NotEmpty(message = "Invoice items must not be empty")
    List<InvoiceItemRequest> itemsRequest;

}
