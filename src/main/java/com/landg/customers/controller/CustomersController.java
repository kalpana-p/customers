package com.landg.customers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.landg.customers.entity.Customer;
import com.landg.customers.service.CustomerService;

@RestController
public class CustomersController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/customers")
	public Customer postCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@PutMapping("/customers/{id}")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
}
