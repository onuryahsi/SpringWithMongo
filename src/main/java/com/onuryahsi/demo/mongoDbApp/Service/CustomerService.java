package com.onuryahsi.demo.mongoDbApp.Service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onuryahsi.demo.mongoDbApp.Inteface.ICustomerService;
import com.onuryahsi.demo.mongoDbApp.Model.Customer;
import com.onuryahsi.demo.mongoDbApp.Repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	private CustomerRepository customerRepository;

	@Autowired
	public CustomerService(CustomerRepository repository) {
		this.customerRepository = repository;
	}

	@Override
	public Iterable<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(ObjectId _id) {
		// TODO Auto-generated method stub
		return customerRepository.findBy_id(_id);
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(ObjectId _id) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findBy_id(_id);
		customerRepository.delete(customer);

	}

}
