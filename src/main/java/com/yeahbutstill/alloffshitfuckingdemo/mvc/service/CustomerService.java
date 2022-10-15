package com.yeahbutstill.alloffshitfuckingdemo.mvc.service;

import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);

}
