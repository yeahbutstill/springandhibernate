package com.yeahbutstill.alloffshitfuckingdemo.mvc.dao;

import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
