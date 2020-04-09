package com.home.javatraining.manager;

import com.home.javatraining.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerManager extends AbstractManager {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerRepository getRepository() {
        return this.customerRepository;
    }
}
