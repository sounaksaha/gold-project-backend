package com.gold.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gold.project.entity.Transaction_Entity;
import com.gold.project.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "http://localhost:5173")
public class TransactionController {

    @Autowired
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{phoneNo}")
    public ResponseEntity<List<Transaction_Entity>> getTransactionsByPhoneNo(@PathVariable String phoneNo) {
        List<Transaction_Entity> transactions = transactionService.getTransactionsByPhoneNo(phoneNo);
        return ResponseEntity.ok(transactions);
    }
}
