package com.example.CProject.model;
import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "supplier")
@Entity
public class Supplier { //поставщиk

    @Id
    @Column(name = "id")
    private int id;
    @NotNull
    @Column(name = "info")
    private String info;//информарция о компании


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInformationAboutTheCompany() {
        return info;
    }

    public void setInformationAboutTheCompany(String informationAboutTheCompany) {
        this.info = informationAboutTheCompany;
    }


}
