package com.example.lab8rest.service;

import com.example.lab8rest.model.Customer;
import com.example.lab8rest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
