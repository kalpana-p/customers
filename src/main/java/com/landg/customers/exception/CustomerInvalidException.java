package com.landg.customers.exception;

/**
 * 
 * @author Kalpana
 *
 */
public class CustomerInvalidException extends RuntimeException {

	private static final long serialVersionUID = -3087901635734988306L;

	public CustomerInvalidException(){
		super("Invalid Customer");
	}
}
