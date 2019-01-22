package com.onuryahsi.demo.mongoDbApp.Inteface;

import org.bson.types.ObjectId;

import com.onuryahsi.demo.mongoDbApp.Model.Customer;

public interface ICustomerService {

	Iterable<Customer> getAllCustomers();

	Customer getCustomerById(ObjectId _id);

	Customer saveCustomer(Customer customer);

	void deleteCustomer(ObjectId _id);
}
