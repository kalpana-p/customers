package com.landg.customers.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
/**
 * 
 * @author Kalpana
 *
 */
@Data
@Entity
public class Email {

	@Id
	private String id;
	private boolean isRegd;
}
