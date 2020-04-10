package com.home.javatraining.repository;

import com.home.javatraining.entity.AccountHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountHistoryRepository extends JpaRepository<AccountHistory, String>, JpaSpecificationExecutor<AccountHistory> {

}