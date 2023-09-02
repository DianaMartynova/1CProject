package com.example.CProject.mapper;

import com.example.CProject.controller.dto.CustomerDto;
import com.example.CProject.model.Customer;
import org.springframework.stereotype.Component;

@Component
public interface CustomerMapper {
    CustomerDto CustomerToCustomerDto(Customer customer);
}
