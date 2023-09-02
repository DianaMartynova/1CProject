package com.example.CProject.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "product")
@Entity
public class Product { //товар
    @Id
    @NotNull
    @Column(name = "id")
    private int id;
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name = "quantity")
    private int quantity; //количество
    @NotNull
    @Column(name = "status")
    private String status; //статус наличия товара
    @NotNull
    @Column(name = "characteristic")
    private String characteristic;//характеристика
    @NotNull
    @Column(name = "priceProduct")
    private int priceProduct; //цена

    @Column(name = "comment")
    private String comment;//комментарий

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public int getPrice() {
        return priceProduct;
    }

    public void setPrice(int price) {
        this.priceProduct = price;
    }


}