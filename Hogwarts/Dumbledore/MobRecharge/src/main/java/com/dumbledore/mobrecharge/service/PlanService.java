package com.dumbledore.mobrecharge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dumbledore.mobrecharge.model.Plan;
import com.dumbledore.mobrecharge.repository.PlansRepository;

@Service
public class PlanService {
	
	@Autowired
	PlansRepository plansRepository;

	public void addingPlan(Plan plan) {
		plansRepository.save(plan);
	}

	public List<Plan> getPlans() {
		
		return plansRepository.findAll();
	}

	public void deletingPlan(int planId) {
		plansRepository.deleteById(planId);
		
	}

}
