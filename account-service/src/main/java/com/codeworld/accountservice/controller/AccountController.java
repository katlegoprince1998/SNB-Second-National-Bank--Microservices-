package com.codeworld.accountservice.controller;

import com.codeworld.accountservice.entity.Account;
import com.codeworld.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private  AccountService accountService;

    @PostMapping("/create")
    public Account createAccount(Account account){
        return accountService.createAccount(account);
    }

    @GetMapping("/get/{id}")
    public Account getAccount(@PathVariable Long id){
        return accountService.getAccount(id);
    }

    @GetMapping("/get")
    public List<Account> getAccounts(){
        return accountService.getAllAccounts();
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, String> deleteAccount(@PathVariable Long id){
        Map<String, String> response = new HashMap<>();
        response.put("message", "Account deleted successfully");
         accountService.deleteAccount(id);
         return response;
    }

    @GetMapping("/get/{customerId}")
    public Account getAccountByCustomerId(@PathVariable Long customerId){
        return accountService.getAccountByCustomerId(customerId);
    }

}
