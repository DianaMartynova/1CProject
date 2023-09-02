package com.example.CProject.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Table(name = "customer")
@Entity
public class Customer { //покупатель
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "telefon")
    private int telefon;
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name = "invoiceList")
    @OneToMany
    @JoinColumn(name = "InvoiceId")
    private List<Invoice> invoiceList; //чек

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
}

