package com.example.lab8rest.service;

import com.example.lab8rest.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer findById(int id);

    void save(Customer customer);

    void delete(int id);

    List<Customer> findAll();

}
