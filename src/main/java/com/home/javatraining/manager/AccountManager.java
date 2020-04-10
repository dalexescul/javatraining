package com.home.javatraining.manager;

import com.home.javatraining.entity.AbstractTemporalEntity;
import com.home.javatraining.entity.Account;
import com.home.javatraining.entity.Customer;
import com.home.javatraining.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountManager extends AbstractManager {

    private AccountRepository accountRepository;

    @Autowired
    public AccountManager(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override()
    public Account updateOne(AbstractTemporalEntity oldInstance, AbstractTemporalEntity updateData) {
        Account acountInstance = (Account) oldInstance;
        Account accountUpdateData = (Account) updateData;

        acountInstance.setBalance(accountUpdateData.getBalance());
        acountInstance.setCurrency(accountUpdateData.getCurrency());
        acountInstance.setBalance(accountUpdateData.getBalance());
        acountInstance.setRestricted(accountUpdateData.getRestricted());
        acountInstance.setCustomer(accountUpdateData.getCustomer());

        return this.getRepository().saveAndFlush(acountInstance);
    }

    public AccountRepository getRepository() {
        return this.accountRepository;
    }
}
