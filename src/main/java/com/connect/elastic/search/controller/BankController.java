package com.connect.elastic.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.connect.elastic.search.entity.Bank;
import com.connect.elastic.search.service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	@GetMapping("/getAll")
	public Iterable<Bank> findAllData() {
		return bankService.findAllData();
	}
}
