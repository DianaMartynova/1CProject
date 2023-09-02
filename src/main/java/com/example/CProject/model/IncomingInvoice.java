package com.example.CProject.model;
import com.sun.istack.NotNull;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Table(name = "incomingInvoice")
@Entity
public class IncomingInvoice {//накладная прихода
    @Id
    @Column(name = "id")
    private int id;
    @NotNull
    @Column(name = "suplier")
    private Supplier supplier;
    @NotNull
    @Column(name = "productList")
    @OneToMany
    @JoinColumn(name = "ProductId")
    private List<Product> productList; // лист товара
    @NotNull
    @Column(name = "seller")
    private Seller seller;
    @NotNull
    @Column(name = "dateTime")
    private LocalDateTime dateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Supplier getSuplier() {
        return supplier;
    }

    public void setSuplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
