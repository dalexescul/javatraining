package com.home.javatraining.controller;

import com.home.javatraining.entity.Customer;
import com.home.javatraining.manager.AbstractManager;
import com.home.javatraining.manager.CustomerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/customer")
public class CustomerController extends AbstractRestController {

    private CustomerManager customerManager;

    @Autowired
    public CustomerController(CustomerManager customerManager) {
        this.customerManager = customerManager;
    }

    @Override
    public CustomerManager getManager() {
        return customerManager;
    }

    @Override
    public Class getEntityClass() {
        return Customer.class;
    }

}
