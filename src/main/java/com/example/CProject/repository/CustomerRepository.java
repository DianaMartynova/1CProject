package com.example.CProject.repository;

import com.example.CProject.model.Customer;
import com.example.CProject.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByTelefon(int telefon);

    @Query(value = "SELECT telefon FROM customer WHERE name = :name", nativeQuery = true)
    int findTelefonByName(String name);

    List<Invoice> findByName(String name);
}
