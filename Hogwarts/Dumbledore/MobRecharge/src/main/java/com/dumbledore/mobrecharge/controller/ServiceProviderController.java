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

import com.dumbledore.mobrecharge.model.Plan;
import com.dumbledore.mobrecharge.model.ServiceProvider;
import com.dumbledore.mobrecharge.model.myenum.Provider;
import com.dumbledore.mobrecharge.service.PlanService;
import com.dumbledore.mobrecharge.service.ServiceProviderService;

@RequestMapping("/v1.0/MobRecharge/Select/Service")
@RestController
@Controller
public class ServiceProviderController {
	@Autowired
	ServiceProviderService providerService;
	
	@Autowired
	PlanService plans;
	
	// To do a Mobile ReCharge
	@PostMapping("/mobileRecharge/{phoneNumber}")
	List<Plan> mobileRecharge(@RequestBody ServiceProvider serviceProvider , @PathVariable long phoneNumber) {
		serviceProvider.setPhoneNumber(phoneNumber);
		return providerService.showAllPlans(serviceProvider);
	}
	
	@GetMapping("/all")
	public List<Provider> showAllProviders()
	{
		return providerService.getAll();
	}
	
	// ---------------------- Admin Controls ----------------------------
	
	@PostMapping("/addProvider")
	public String addServiceProvider(ServiceProvider serviceProvider)
	{
		providerService.add(serviceProvider);
		return "New Service Provider Sucessfully Added !!";
	}
	
	
	
	

}
