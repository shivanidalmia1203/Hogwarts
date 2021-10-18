package com.dumbledore.mobrecharge.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.dumbledore.mobrecharge.model.myenum.Gender;
import com.sun.istack.NotNull;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer customerId;
	
	@NotNull private String firstName;
	@NotNull private String lastName;
	@NotNull private String email;
	@NotNull private String password;
	@NotNull private Long mobileNumber;
	@NotNull private Date dateOfBirth;
	@NotNull private Gender gender;
	@NotNull private Date dateOfCreation;
	private Date dateOfUpdate;
	
	
	/*
	 * Mapped ( Customer -> BankAccount )
	 */
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
	private List<BankAccount> bankAccountsList = new ArrayList<>();
	
	
	
	/*
	 * @Constructors
	 */
	public Customer() {
		super();
	}
	public Customer(String firstName, String lastName, String email, String password, Long mobileNumber,
			Date dateOfBirth, Gender gender, Date dateOfCreation, Date dateOfUpdate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.dateOfCreation = dateOfCreation;
		this.dateOfUpdate = dateOfUpdate;
	}
	
	
	
	/*
	 * @Getters
	 * @Setters
	 */
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public Date getDateOfUpdate() {
		return dateOfUpdate;
	}
	public void setDateOfUpdate(Date dateOfUpdate) {
		this.dateOfUpdate = dateOfUpdate;
	}

}
