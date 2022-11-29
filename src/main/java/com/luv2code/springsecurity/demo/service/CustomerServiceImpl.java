package com.luv2code.springsecurity.demo.service;

import java.util.List;
import java.util.Optional;

import com.luv2code.springsecurity.demo.dao.CustomerDao;
import com.luv2code.springsecurity.demo.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao theCustomerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao theCustomerDao) {
        this.theCustomerDao = theCustomerDao;
    }

    @Override
    public void save(Customer theCustomer) {

        theCustomerDao.save(theCustomer);
    }

    @Override
    public List<Customer> findAll() {
        
        return theCustomerDao.findAll();
    }

    // @Override
    // public Customer findById(int theId) {
    //     Optional<Customer> result=theCustomerDao.findById(theId);

    //     Customer customer=null;
    //     if(result.isPresent()){
    //         customer =result.get();
    //     }else{
    //         throw new RuntimeException("Did not find employee id - " + theId);
    //     }
        
    //     return CustomerDao.deleteById(result);
    // }

    @Override
    public Customer findById(int theId) {
        Optional<Customer> result=theCustomerDao.findById(theId);

        Customer customer=null;
        if(result.isPresent()){
            customer =result.get();
        }else{
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        
        return customer;
    }

    @Override
    public void saveAndFlush(Customer theCustomer) {
        
        theCustomerDao.saveAndFlush(theCustomer);

    }

    @Override
    public List<Customer> findByTrackId(int trackId) {
       
        List<Customer> results = null;

        if(trackId != 0){
            results =theCustomerDao.findByTrackId(trackId);

        }else{
            results=findAll();
        }

        return results;
    }

    @Override
    public void deleteById(int theId) {
        // TODO Auto-generated method stub
        theCustomerDao.deleteById(theId);
    }

    

    
    
}