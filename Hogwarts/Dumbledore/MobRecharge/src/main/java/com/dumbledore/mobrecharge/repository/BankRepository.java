package com.dumbledore.mobrecharge.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dumbledore.mobrecharge.model.BankAccount;


public interface BankRepository extends JpaRepository<BankAccount , Integer>{
   public BankAccount findByaccountNumber(long accountNumber);
    public void deleteByaccountNumber(long accountNumber);
}
