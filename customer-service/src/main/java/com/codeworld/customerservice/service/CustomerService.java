package com.codeworld.customerservice.service;

import com.codeworld.customerservice.entity.Customer;

import java.util.List;

public interface CustomerService {

   Customer createCustomer(Customer customer);
   List<Customer> getAllCustomers();

   Customer getCustomerById(Long id);

   void deleteCustomer(Long id);

}
