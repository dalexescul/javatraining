package com.home.javatraining.manager;

import com.home.javatraining.entity.AbstractTemporalEntity;
import com.home.javatraining.entity.Customer;
import com.home.javatraining.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerManager extends AbstractManager {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer updateOne(AbstractTemporalEntity oldInstance, AbstractTemporalEntity updateData) {
        Customer customerInstance = (Customer) oldInstance;
        Customer customerUpdateData = (Customer) updateData;

        customerInstance.setAddress(customerUpdateData.getAddress());
        customerInstance.setResidency(customerUpdateData.getResidency());
        customerInstance.setEmail(customerUpdateData.getEmail());
        customerInstance.setDateOfBirth(customerUpdateData.getDateOfBirth());
        customerInstance.setDateOfDeath(customerUpdateData.getDateOfDeath());
        customerInstance.setFullName(customerUpdateData.getFullName());
        customerInstance.setMobileNo(customerUpdateData.getMobileNo());

        return this.getRepository().saveAndFlush(customerInstance);
    }

    public CustomerRepository getRepository() {
        return this.customerRepository;
    }
}
