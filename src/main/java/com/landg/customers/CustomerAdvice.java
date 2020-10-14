package com.landg.customers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.landg.customers.exception.CustomerInvalidException;
import com.landg.customers.exception.CustomerNotFoundException;
/**
 * 
 * @author Kalpana
 *
 */
@ControllerAdvice
public class CustomerAdvice {

	@ResponseBody
	@ExceptionHandler(CustomerNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String customerNotFoundHandler(CustomerNotFoundException ex) {
		return ex.getMessage();
	}
	
	@ResponseBody
	@ExceptionHandler(CustomerInvalidException.class)
	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	String customerInvalidHandler(CustomerInvalidException ex) {
		return ex.getMessage();
	}
}
