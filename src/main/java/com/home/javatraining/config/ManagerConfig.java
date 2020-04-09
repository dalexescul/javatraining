package com.home.javatraining.config;

import com.home.javatraining.manager.CustomerManager;
import com.home.javatraining.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManagerConfig {

    @Bean
    public CustomerManager customerManager(CustomerRepository customerRepository) {
        return new CustomerManager(customerRepository);
    }

}
