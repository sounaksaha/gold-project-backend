package com.gold.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gold.project.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	//List<Customer> findAll();
	long count();
}
