package com.connect.elastic.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connect.elastic.search.entity.Bank;
import com.connect.elastic.search.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository bankRepo;

	public Iterable<Bank> findAllData() {
		return bankRepo.findAll();
	}
}
