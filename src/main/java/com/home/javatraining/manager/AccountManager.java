package com.home.javatraining.manager;

import com.home.javatraining.entity.AbstractTemporalEntity;
import com.home.javatraining.entity.Account;
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
        Account accountInstance = (Account) oldInstance;
        Account accountUpdateData = (Account) updateData;

        accountInstance.setBalance(accountUpdateData.getBalance());
        accountInstance.setCurrency(accountUpdateData.getCurrency());
        accountInstance.setBalance(accountUpdateData.getBalance());
        accountInstance.setRestricted(accountUpdateData.getRestricted());
        accountInstance.setCustomer(accountUpdateData.getCustomer());

        return this.getRepository().saveAndFlush(accountInstance);
    }

    public AccountRepository getRepository() {
        return this.accountRepository;
    }
}
