package com.codeworld.customerservice.controller;

import com.codeworld.customerservice.entity.Customer;
import com.codeworld.customerservice.service.CustomerService;
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

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @GetMapping("/get/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/get")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, String> deleteCustomer(@PathVariable Long id) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Customer deleted successfully");
        customerService.deleteCustomer(id);
        return response;
    }
}
