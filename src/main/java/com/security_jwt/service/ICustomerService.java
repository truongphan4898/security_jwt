package com.security_jwt.service;

import com.security_jwt.model.Customer;

import java.util.Currency;
import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findOne(Long id);
    void save(Customer customer);
    void delete(Long id);
}
