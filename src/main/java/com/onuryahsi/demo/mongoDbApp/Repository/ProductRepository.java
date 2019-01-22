package com.onuryahsi.demo.mongoDbApp.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.onuryahsi.demo.mongoDbApp.Model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
	Product findBy_id(ObjectId _id);
}
