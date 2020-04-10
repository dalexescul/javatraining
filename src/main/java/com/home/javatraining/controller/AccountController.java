package com.home.javatraining.controller;

import com.home.javatraining.entity.Account;
import com.home.javatraining.manager.AbstractManager;
import com.home.javatraining.manager.AccountManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/account")
public class AccountController extends AbstractRestController {

    private AccountManager accountManager;

    @Autowired
    public AccountController(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public AccountManager getManager() {
        return accountManager;
    }

    @Override
    public Class getEntityClass() {
        return Account.class;
    }
}
