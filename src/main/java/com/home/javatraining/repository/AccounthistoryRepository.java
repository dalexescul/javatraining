package com.home.javatraining.repository;

import com.home.javatraining.entity.AccountHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccounthistoryRepository extends JpaRepository<AccountHistory, String>, JpaSpecificationExecutor<AccountHistory> {

}