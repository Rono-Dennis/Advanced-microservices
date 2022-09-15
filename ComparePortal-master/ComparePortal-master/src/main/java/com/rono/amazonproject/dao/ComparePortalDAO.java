package com.rono.amazonproject.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rono.amazonproject.model.ComparePortalProduct;

public interface ComparePortalDAO extends MongoRepository<ComparePortalProduct, Integer>{
	
	
}
