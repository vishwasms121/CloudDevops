package com.luv2code.springsecurity.demo.dao;

import java.util.List;
// import java.util.Optional;

import com.luv2code.springsecurity.demo.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

    public List<Customer> findByTrackId(int trackId);

    // public void deleteById();

    // public static Customer deleteById(Optional<Customer> result) {
    // return null;
    // }

}