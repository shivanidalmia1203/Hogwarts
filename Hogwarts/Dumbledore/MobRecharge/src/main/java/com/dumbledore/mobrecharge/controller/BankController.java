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

import com.dumbledore.mobrecharge.model.BankAccount;
import com.dumbledore.mobrecharge.service.BankService;

@RestController
@RequestMapping("/v1.0/MobRecharge/AccountDetails")
public class BankController {
	@Autowired
	BankService bankService;
	
	@GetMapping("/")
	public List<BankAccount> getAllDetails()
	{
		return bankService.getAllBankDetails();
	}
	
    @DeleteMapping("/delete")
    public String deleteAllBankDetails()
    {
    	bankService.deleteBankDetails();
    	return "Successfully Deleted Details";
    }
    
    @PostMapping("/addNewAccount")
    public BankAccount addNewAccountDetails(@RequestBody BankAccount bankAccount)
    {
    	return bankService.saveBankDetails(bankAccount);
    	
    }
    
    @GetMapping("/{accountNumber}")
	public BankAccount getDetailsByAccountNumber(@PathVariable long accountNumber)
	{
		return bankService.getDetailByAccountNumber(accountNumber);
	}
    
    @DeleteMapping("/{accountNumber}")
    public String deleteAllBankDetails(@PathVariable long accountNumber)
    {
    	bankService.deleteBankDetailbyAccountNumber(accountNumber);
    	return "Successfully Deleted AccountDetails";
    }

    
}

