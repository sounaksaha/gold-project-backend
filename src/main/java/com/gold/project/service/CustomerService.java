package com.gold.project.service;

import java.util.List;
import com.gold.project.entity.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();
    //Optional<Customer> getCustomerWithTransactions(Long phoneNo);
	 long getTotalCustomers();
}