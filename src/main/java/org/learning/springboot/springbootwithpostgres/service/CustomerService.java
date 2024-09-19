package org.learning.springboot.springbootwithpostgres.service;

import org.learning.springboot.springbootwithpostgres.model.Customer;
import org.learning.springboot.springbootwithpostgres.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer find(String id) throws Exception {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isEmpty()) {
            throw new Exception("customer not found with given ID: " + id);
        }
        return customer.get();
    }

    public Iterable<Customer> findAll() throws Exception {
        return customerRepository.findAll();
    }

    public void delete(String id) throws Exception {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isEmpty()) {
            throw new Exception("customer not found with given ID: " + id);
        }
        customerRepository.deleteById(customer.get().getId());
    }

}