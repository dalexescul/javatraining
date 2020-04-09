package com.home.javatraining.repository;

import com.home.javatraining.entity.CustomerHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerhistoryRepository extends JpaRepository<CustomerHistory, String>, JpaSpecificationExecutor<CustomerHistory> {

}