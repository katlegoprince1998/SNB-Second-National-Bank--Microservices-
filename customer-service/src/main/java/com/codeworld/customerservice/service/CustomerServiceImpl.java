package com.codeworld.customerservice.service;

import com.codeworld.customerservice.entity.Customer;
import com.codeworld.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.addCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getCustomers();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.getCustomerById(id);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteCustomerById(id);
    }
}
