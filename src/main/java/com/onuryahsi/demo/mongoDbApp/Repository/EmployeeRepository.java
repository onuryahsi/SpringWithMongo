package com.onuryahsi.demo.mongoDbApp.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.onuryahsi.demo.mongoDbApp.Model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
	Employee findBy_id(ObjectId _id);
}
