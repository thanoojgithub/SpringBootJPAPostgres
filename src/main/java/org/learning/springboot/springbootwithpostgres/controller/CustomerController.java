package org.learning.springboot.springbootwithpostgres.controller;

import org.learning.springboot.springbootwithpostgres.model.Customer;
import org.learning.springboot.springbootwithpostgres.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public Iterable<Customer> findAll() throws Exception {
        return customerService.findAll();
    }

}
