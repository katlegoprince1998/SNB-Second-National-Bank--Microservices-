package com.codeworld.customerservice.controller;

import com.codeworld.customerservice.entity.Customer;
import com.codeworld.customerservice.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    private final static Logger LOGGER =
            LoggerFactory.getLogger(CustomerController.class);

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        LOGGER.info("Creating customer: {}", customer);
        return customerService.createCustomer(customer);
    }

    @GetMapping("/get/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        LOGGER.info("Fetching customer with id: {}", id);
        return customerService.getCustomerById(id);
    }

    @GetMapping("/get")
    public List<Customer> getAllCustomers() {
        LOGGER.info("Fetching all customers");
        return customerService.getAllCustomers();
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, String> deleteCustomer(@PathVariable Long id) {
        LOGGER.info("Deleting customer with id: {}", id);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Customer deleted successfully");
        customerService.deleteCustomer(id);
        return response;
    }
}
