package com.connect.elastic.search.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.connect.elastic.search.entity.Bank;

public interface BankRepository extends ElasticsearchRepository<Bank, String>{

}
