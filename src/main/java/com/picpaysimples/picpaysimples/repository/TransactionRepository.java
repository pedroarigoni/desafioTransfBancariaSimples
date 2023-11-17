package com.picpaysimples.picpaysimples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimples.picpaysimples.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
