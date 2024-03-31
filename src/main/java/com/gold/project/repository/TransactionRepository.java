package com.gold.project.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gold.project.entity.Transaction_Entity;

public interface TransactionRepository extends JpaRepository<Transaction_Entity, Long> {
	 List<Transaction_Entity> findByCustomer_PhoneNo(String phoneNo);
}