package com.codeworld.accountservice.repository;

import com.codeworld.accountservice.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepository {
    private List<Account> accounts = new ArrayList<>();

    public Account addAccount(Account account) {
        accounts.add(account);
        return account;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account getAccountById(Long id) {
        return accounts.stream().filter(customer -> customer.getId().equals(id)).findFirst().orElse(null);
    }
    public void deleteAccount(Long id) {
        accounts.removeIf(customer -> customer.getId().equals(id));
    }

    public Account getAccountByCustomerId(Long id) {
        return accounts.stream().filter(account -> account.getCustomerId().equals(id)).findFirst().orElse(null);
    }

}
