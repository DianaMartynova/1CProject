package com.example.CProject.controller.dto;

import com.example.CProject.paymentType.PaymentType;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class InvoiceDto implements Serializable {

    private int id;
    private CustomerDto customer; //покупатель
    private List<ProductDto> productList; // лист товара
    private PaymentType paymentType; //тип оплаты
    private LocalDateTime dateTime;
}
