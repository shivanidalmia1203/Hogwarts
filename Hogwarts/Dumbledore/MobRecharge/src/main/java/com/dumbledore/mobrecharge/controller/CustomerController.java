package com.dumbledore.mobrecharge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dumbledore.mobrecharge.model.Customer;
import com.dumbledore.mobrecharge.service.CustomerService;

@RestController
@RequestMapping(value = "v1.0/MobRecharge/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	/*
	 * @TestMapping
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "Customer Endpoint working fine";
	}

	
	
	
	
	/*
	 * Login and Sign-up functionalities
	 */
	@PostMapping("/login")
	public void login() {
		customerService.signIn();
	}

	@PostMapping("/signup")
	public void signup() {
		customerService.signUp();
	}

	
	
	
	
	/*
	 * CRUD operations for customers using Id
	 */
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() { // LIST OF ALL CUSTOMERS
		return customerService.findAllCustomers();
	}
	
	@PostMapping("/addCustomer")
	public String addCustomers(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return "Customer Created Successfully";
	}
	
	

	/*
	 * CRUD operations for customer functionalities using mobile number
	 */

	@GetMapping("/{number}")
	public Customer getCustomerByNumber(@PathVariable Long number) {
		return customerService.findByNumber(number);
	}

	@PutMapping("/{number}/{newNumber}")
	public void updateCustomerNumber(@PathVariable Long number, @PathVariable Long newNumber) {
		customerService.updateCustomer(number, newNumber);
	}

	@DeleteMapping("/{number}")
	public void deleteCustomerByNumber(@PathVariable Long number) {
		customerService.deleteCustomer(number);
	}

	
	
	
	/*
	 * Show all available services to customers
	 */
	@GetMapping("/services")
	public List<String> getAllServices() {
		return customerService.showAllServices();
	}

}
