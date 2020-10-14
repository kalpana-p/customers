package com.landg.customers.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
/**
 * 
 * @author Kalpana
 *
 */
@Data
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String line1;
	private String line2;
	private String line3;
	private String line4;
	private String postCode;
	private boolean isPreferredCommunication;
	
	@Enumerated(EnumType.STRING)
	private AddressType addressType;
	
}
