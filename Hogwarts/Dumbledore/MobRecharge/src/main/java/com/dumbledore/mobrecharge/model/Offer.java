package com.dumbledore.mobrecharge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Offer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	// private String typeOfOffer;  
	private String validThru;
	float amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public String getTypeOfOffer() {
//		return typeOfOffer;
//	}
//
//	public void setTypeOfOffer(String typeOfOffer) {
//		this.typeOfOffer = typeOfOffer;
//	}

	public String getValidThru() {
		return validThru;
	}

	public void setValidThru(String validThru) {
		this.validThru = validThru;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Offer() {
		super();
	}

	public Offer(Integer id, String validThru) {
		super();
		this.id = id;
		this.validThru = validThru;
	}

}
