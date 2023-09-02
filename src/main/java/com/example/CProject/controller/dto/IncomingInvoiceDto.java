package com.example.CProject.controller.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class IncomingInvoiceDto implements Serializable {
    private int id;

    private SupplierDto supplier;

    private List<ProductDto> productList; // лист товара

    private SellerDto seller;

    private LocalDateTime dateTime;

}
