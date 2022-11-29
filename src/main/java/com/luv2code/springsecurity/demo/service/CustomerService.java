package com.luv2code.springsecurity.demo.service;

import java.util.List;

import com.luv2code.springsecurity.demo.entity.Customer;

public interface CustomerService {
    
    public void save(Customer theCustomer);

    public List<Customer> findAll();

    public Customer findById(int theId);

    public void saveAndFlush(Customer theCustomer);

    public List<Customer> findByTrackId(int trackId);

    public void deleteById(int theId);

}