package com.example.controller;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class Controller {

    private CustomerRepository customerRepository;

    @Autowired
    public Controller(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insertCustomer(@RequestBody Customer customer){
        customerRepository.insert(customer);
    }
}
