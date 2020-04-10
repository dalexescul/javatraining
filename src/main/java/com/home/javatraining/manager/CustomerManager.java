package com.home.javatraining.manager;

import com.home.javatraining.entity.Customer;
import com.home.javatraining.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerManager extends AbstractManager<Customer> {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer updateOne(Customer oldInstance, Customer updateData) {

        oldInstance.setAddress(updateData.getAddress());
        oldInstance.setResidency(updateData.getResidency());
        oldInstance.setEmail(updateData.getEmail());
        oldInstance.setDateOfBirth(updateData.getDateOfBirth());
        oldInstance.setDateOfDeath(updateData.getDateOfDeath());
        oldInstance.setFullName(updateData.getFullName());
        oldInstance.setMobileNo(updateData.getMobileNo());

        return this.getRepository().saveAndFlush(oldInstance);
    }

    public CustomerRepository getRepository() {
        return this.customerRepository;
    }
}
