package com.home.javatraining.manager;

import com.home.javatraining.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountManager extends AbstractManager {

    private AccountRepository accountRepository;

    @Autowired
    public AccountManager(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountRepository getRepository() {
        return this.accountRepository;
    }
}
