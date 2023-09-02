package com.example.CProject.model;
import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "seller")
@Entity
public class Seller { //продавец
    @Id
    @Column(name = "id")
    private int id;
    @NotNull
    @Column(name = "fio")
    private String fio;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return fio;
    }

    public void setName(String name) {
        this.fio = name;
    }


}
