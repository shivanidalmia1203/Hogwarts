package com.dumbledore.mobrecharge.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int validityOfPlan;
	private float amount;
	private String typeOfPlan;  //Try making enum

	public Plan() {
		super();
	}

	public Plan(int id, int validityOfPlan, float amount, String typeOfPlan) {
		super();
		this.id = id;
		this.validityOfPlan = validityOfPlan;
		this.amount = amount;
		this.typeOfPlan = typeOfPlan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValidityOfPlan() {
		return validityOfPlan;
	}

	public void setValidityOfPlan(int validityOfPlan) {
		this.validityOfPlan = validityOfPlan;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getTypeOfPlan() {
		return typeOfPlan;
	}

	public void setTypeOfPlan(String typeOfPlan) {
		this.typeOfPlan = typeOfPlan;
	}

}
