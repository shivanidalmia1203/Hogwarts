package com.dumbledore.mobrecharge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dumbledore.mobrecharge.model.Offer;
import com.dumbledore.mobrecharge.model.Plan;
import com.dumbledore.mobrecharge.service.OfferService;
import com.dumbledore.mobrecharge.service.PlanService;

@RestController
@RequestMapping("/v1.0/MobRecharge/Plans")
public class PlanController {
	
	@Autowired
	PlanService planService;
	
	@Autowired 
	OfferService offerService;
	
	@GetMapping("/{planId}")
	List<Offer> showAllOffers()
	{
		return offerService.getOffers();
	}
	
	
// ---------------  Admin Controls ------------------------
	
	@PostMapping("/add")
	public String addPlan(@RequestBody Plan plan)
	{
		planService.addingPlan(plan);
		return "Plan Sucessfully Added !!";
	}
	
	@GetMapping("/all")
	public List<Plan> showAllPlans()
	{
		return planService.getPlans();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePlan(@PathVariable int id)
	{
		planService.deletingPlan(id);
		return "Plan Sucessfully Deleted !!";
	}
	
	

}
