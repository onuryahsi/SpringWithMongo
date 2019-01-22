package com.onuryahsi.demo.mongoDbApp.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.onuryahsi.demo.mongoDbApp.Model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String>  {
	Customer findBy_id(ObjectId _id);
}
