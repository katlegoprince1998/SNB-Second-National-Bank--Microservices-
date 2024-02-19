package com.codeworld.accountservice.service;

import com.codeworld.accountservice.entity.Account;
import com.codeworld.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private  AccountRepository accountRepository;
    @Override
    public Account createAccount(Account account) {
        return accountRepository.addAccount(account);
    }
    @Override
    public Account getAccount(Long id) {
        return accountRepository.getAccountById(id);
    }
    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.getAccounts();
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteAccount(id);
    }
    @Override
    public Account getAccountByCustomerId(Long customerId) {
        return accountRepository.getAccountByCustomerId(customerId);
    }
}
