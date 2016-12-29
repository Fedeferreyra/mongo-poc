package com.example.repository;

import com.example.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String>{

    Customer insert(Customer customer);

    List<Customer> findAll();
}
