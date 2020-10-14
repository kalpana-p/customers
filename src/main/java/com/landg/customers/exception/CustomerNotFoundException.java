package com.landg.customers.exception;

/**
 * 
 * @author Kalpana
 *
 */
public class CustomerNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3087901635734988306L;

	public CustomerNotFoundException(Long id){
		super("Could not find customer " + id);
	}
}
