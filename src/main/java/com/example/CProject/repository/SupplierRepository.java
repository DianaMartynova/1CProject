package com.example.CProject.repository;
import com.example.CProject.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

}
