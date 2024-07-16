package com.connect.elastic.search.repository;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.connect.elastic.search.entity.Product;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product,Integer> {

        }

	


