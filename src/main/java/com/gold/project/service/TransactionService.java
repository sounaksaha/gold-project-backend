package com.gold.project.service;

import java.util.List;

import com.gold.project.entity.Transaction_Entity;

public interface TransactionService {
    List<Transaction_Entity> getTransactionsByPhoneNo(String phoneNo);
}