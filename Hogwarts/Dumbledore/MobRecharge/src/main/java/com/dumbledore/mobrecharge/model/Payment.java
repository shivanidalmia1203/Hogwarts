package com.dumbledore.mobrecharge.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.dumbledore.mobrecharge.model.myenum.ModeOfPayment;
import com.dumbledore.mobrecharge.model.myenum.Status;
import com.sun.istack.NotNull;


@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Integer paymentId;
	@NotNull
	private float amount;
	@NotNull
	private Date dateOfPayment;
	@NotNull
	private ModeOfPayment modeOfPayment;
	@NotNull
	private Time timeStamp;
	@NotNull
	private Status status;

	/*
	 * @Constructors
	 */
	public Payment() {
		super();
	}

	public Payment(float amount, Date dateOfPayment, ModeOfPayment modeOfPayment, Time timeStamp, Status status) {
		super();
		this.amount = amount;
		this.dateOfPayment = dateOfPayment;
		this.modeOfPayment = modeOfPayment;
		this.timeStamp = timeStamp;
		this.status = status;
	}

	public Payment(Integer paymentId, float amount, Date dateOfPayment, ModeOfPayment modeOfPayment, Time timeStamp,
			Status status) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.dateOfPayment = dateOfPayment;
		this.modeOfPayment = modeOfPayment;
		this.timeStamp = timeStamp;
		this.status = status;
	}

	/*
	 * @Getters
	 * 
	 * @Setters
	 */
	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	public ModeOfPayment getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(ModeOfPayment modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public Time getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Time timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
