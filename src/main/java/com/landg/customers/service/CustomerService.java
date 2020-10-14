package com.landg.customers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.landg.customers.entity.Customer;
import com.landg.customers.exception.CustomerInvalidException;
import com.landg.customers.exception.CustomerNotFoundException;
import com.landg.customers.repository.CustomerRepository;
/**
 * 
 * @author Kalpana
 *
 */
@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException(id));
	}
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
		if(customerRepository.existsById(customer.getId())) {
			return customerRepository.save(customer);
		}
		throw new CustomerInvalidException();
	}
}
