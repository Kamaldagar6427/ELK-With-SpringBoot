package com.connect.elastic.search.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "bank_db")
public class Bank {

	@Id
	private String id;
	private long account_number ;
	private long balance;
	private String firstname;
	private String lastname;
	private long age;
	private String gender;
	private String address;
	private String employer;
	private String email;
	private String city;
	

	
	
	
}
