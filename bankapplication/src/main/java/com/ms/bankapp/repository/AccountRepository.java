package com.ms.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.bankapp.bean.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
