package com.landg.customers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.landg.customers.entity.Customer;
/**
 * 
 * @author Kalpana
 *
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
