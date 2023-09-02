package com.example.CProject.controller;

import com.example.CProject.controller.dto.CustomerDto;
import com.example.CProject.mapper.CustomerMapper;
import com.example.CProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    //get ищем кастомера по id -- на вход id получаем customer
    //getAll найди всех кастомеров, getBy(поиск по " чему-то" )
    //post добавляем кастомера с name telefon.. --на вход id,name telefon-- получаем ничего
    //put обновляем данные по id
    // приходит целый кастомер
    //delete -id на вход id  и получаем ничего
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerMapper customerMapper;

    @GetMapping("/customerId")
    public CustomerDto getCustomer(@RequestParam(value = "customerId") int customerId) {
        return customerMapper.CustomerToCustomerDto(customerService.getCustomerById(customerId));


    }

}
