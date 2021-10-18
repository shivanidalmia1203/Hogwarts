package com.dumbledore.mobrecharge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dumbledore.mobrecharge.model.Offer;
import com.dumbledore.mobrecharge.model.Payment;
import com.dumbledore.mobrecharge.repository.OffersRepository;
import com.dumbledore.mobrecharge.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;
	
	@Autowired
	OffersRepository offerRepository;
	
//	public Payment getDetail(Integer paymentId) {
//		Payment payment =  paymentRepository.findById(paymentId).get();
//		return payment;
//	}
	
	Optional<Offer> offer;
	
	public List<Payment> getAllPayment() {
		return paymentRepository.findAll();
	}

	public void calculateAmount(int offerId) {
		
		float value = 0;
		offer = offerRepository.findById(offerId);
		
		if (offer != null)
		{
			System.out.println("Offer Sucessfully Applied !!");
		}
		else
		{
			System.out.println("Choose a suitable one");
		}
	}
	
	

}
