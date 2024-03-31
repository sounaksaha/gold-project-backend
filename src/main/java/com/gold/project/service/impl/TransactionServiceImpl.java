package com.gold.project.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gold.project.entity.Transaction_Entity;
import com.gold.project.repository.TransactionRepository;
import com.gold.project.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction_Entity> getTransactionsByPhoneNo(String phoneNo) {
        return transactionRepository.findByCustomer_PhoneNo(phoneNo);
    }
}