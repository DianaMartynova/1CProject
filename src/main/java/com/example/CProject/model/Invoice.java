package com.example.CProject.model;
import com.example.CProject.paymentType.PaymentType;
import com.sun.istack.NotNull;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "invoice")
@Entity
public class Invoice { //чек
    @Id
    @Column(name = "id")
    private int id;
    @NotNull
    @Column(name = "customer")
    private Customer customer; //покупатель
    @NotNull
    @Column(name = "productList")
    @OneToMany
    @JoinColumn(name = "ProductId")
    private List<Product> productList; // лист товара
    @NotNull
    @Column(name = "paymentType")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType; //тип оплаты
    @NotNull
    @Column(name = "dateTime")
    private LocalDateTime dateTime;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
