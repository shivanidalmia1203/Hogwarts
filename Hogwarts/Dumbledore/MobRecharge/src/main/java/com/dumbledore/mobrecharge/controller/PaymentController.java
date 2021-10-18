package com.dumbledore.mobrecharge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dumbledore.mobrecharge.model.Offer;
import com.dumbledore.mobrecharge.model.Payment;
import com.dumbledore.mobrecharge.service.PaymentService;

@RequestMapping("/v1.0/MobRecharge/Payments")
@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	// Make Payment after applying an offer using its offer id
	
	@GetMapping("/pay/{offerId}")
	public String makingPayment(@PathVariable int offerId)
	{
		paymentService.calculateAmount(offerId);
		return "Recharge Sucessfull";
	}
	
	
	
	@GetMapping("/all")
	public List<Payment> Payments(){
		return paymentService.getAllPayment();
	}
	
//	@GetMapping("/")
//	Payment getPayment(@PathVariable Integer paymentId) {
//		Payment payment = paymentService.getDetail(paymentId);
//		return payment;
//	}

}
