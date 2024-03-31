package com.gold.project.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gold.project.entity.Customer;
import com.gold.project.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "http://localhost:5173")
public class CustomerController {

	@Autowired
	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping
	public List<Customer> getAllUsers() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/total")
	public ResponseEntity<Long> getTotalCustomers() {
		long totalCustomers = customerService.getTotalCustomers();
		return ResponseEntity.ok(totalCustomers);
	}
}
