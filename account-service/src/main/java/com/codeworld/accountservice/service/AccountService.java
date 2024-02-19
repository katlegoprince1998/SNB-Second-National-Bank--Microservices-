package com.codeworld.accountservice.service;

import com.codeworld.accountservice.entity.Account;

import java.util.List;

public interface AccountService {

    Account createAccount(Account account);

    Account getAccount(Long id);

    List<Account> getAllAccounts();

    void deleteAccount(Long id);

    Account getAccountByCustomerId(Long customerId);


}
