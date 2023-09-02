package com.example.CProject.controller.dto;

import java.io.Serializable;
import java.util.List;

public class CustomerDto implements Serializable {
    private int id;
    private String name;
    private int telefon;
    private List<InvoiceDto> invoiceList;
}
