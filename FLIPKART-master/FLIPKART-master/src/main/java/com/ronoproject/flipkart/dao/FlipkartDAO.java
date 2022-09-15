package com.ronoproject.flipkart.dao;

import com.ronoproject.flipkart.model.FlipkartProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlipkartDAO extends MongoRepository<FlipkartProduct, Integer> {

}
