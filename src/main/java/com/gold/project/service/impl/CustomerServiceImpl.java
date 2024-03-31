package com.gold.project.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gold.project.entity.Customer;
import com.gold.project.repository.CustomerRepository;
import com.gold.project.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private final CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public long getTotalCustomers() {
		
		return customerRepository.count();
	}

}