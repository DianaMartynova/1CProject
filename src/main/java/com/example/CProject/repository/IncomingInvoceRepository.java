package com.example.CProject.repository;

import com.example.CProject.model.IncomingInvoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomingInvoceRepository extends JpaRepository<IncomingInvoice,Integer> {
}
