package com.home.javatraining.manager;

import com.home.javatraining.entity.Account;
import com.home.javatraining.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class AccountManager extends AbstractManager<Account> {

    private AccountRepository accountRepository;

    @Autowired
    public AccountManager(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override()
    public Account updateOne(Account oldInstance, Account updateData) {

        oldInstance.setBalance(updateData.getBalance());
        oldInstance.setCurrency(updateData.getCurrency());
        oldInstance.setBalance(updateData.getBalance());
        oldInstance.setRestricted(updateData.getRestricted());
        oldInstance.setCustomer(updateData.getCustomer());

        return this.getRepository().saveAndFlush(oldInstance);
    }

    public JpaRepository<Account, String> getRepository() {
        return this.accountRepository;
    }
}
