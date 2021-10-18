package com.dumbledore.mobrecharge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dumbledore.mobrecharge.model.Offer;
import com.dumbledore.mobrecharge.repository.OffersRepository;

@Service
public class OfferService {
	@Autowired
	OffersRepository offersRepository;

	// Get all Offers
	public List<Offer> getOffers() {
		return offersRepository.findAll();
	}

	// get offer by given id
	public Offer getOffersById(Integer id) {
		return offersRepository.findById(id).get();
	}

// -------------------------------- Admin Controls ------------------------------------
	// add offer
	public Offer createOffer(Offer offer) {
		return offersRepository.save(offer);
	}

	// delete offer
	public void deleteOffer(Integer id) {
		offersRepository.deleteById(id);
	}

	// update offer
	public void update(Offer offer, int id) {
		offersRepository.save(offer);
	}

}
