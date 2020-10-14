package com.landg.customers.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
/**
 * 
 * @author Kalpana
 *
 */
@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "party_id")
	private Long id;
	private String title;
	private String firstName;
	private String lastName;
	private String middleName;
	private LocalDate dob;
	private Long phone;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@OneToMany(
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	@JoinColumn(name = "party_id")
	private List<Address> addresses;
	
	@OneToMany(
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	@JoinColumn(name = "party_id")
	private List<Email> emails;
}
