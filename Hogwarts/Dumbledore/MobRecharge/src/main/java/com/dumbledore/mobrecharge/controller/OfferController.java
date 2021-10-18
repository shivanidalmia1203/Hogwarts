package com.dumbledore.mobrecharge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dumbledore.mobrecharge.model.Offer;
import com.dumbledore.mobrecharge.service.OfferService;

@RestController
@RequestMapping("/v1.0/MobRecharge/Offers")
@Controller
public class OfferController {
	@Autowired
	OfferService offerService;
	
// -----------------------Admin Controls -------------------------------------	
	// add offer
	@PostMapping("/addoffer")
	public String addOffer(@RequestBody Offer offer) {
		 offerService.createOffer(offer);
		 return "Offer Sucessfully Added";
		 
	}

	@GetMapping("/all")
	public List<Offer> getAllOffers() {
		return offerService.getOffers();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteOffer(@PathVariable int id) {
		offerService.deleteOffer(id);
		return "Offer Sucessfully deleted";
	}

}
