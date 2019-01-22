package com.onuryahsi.demo.mongoDbApp.Controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.onuryahsi.demo.mongoDbApp.Model.Customer;
import com.onuryahsi.demo.mongoDbApp.Service.CustomerService;

@RestController
public class CustomerController {

	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService Service) {
		this.customerService = Service;
		// customerService.saveCustomer(new
		// Customer("asda","asdas","asdas","asdasd","asdas","asdas"));
	}

	@GetMapping(value = "/api/customer")
	public List<Customer> Get() {
		return (List<Customer>) customerService.getAllCustomers();
	}

	@GetMapping(value = "/api/customer/{_id}")
	public Customer Get(@RequestParam ObjectId _id) {
		return customerService.getCustomerById(_id);
	}

	@PostMapping(value = "/api/customer", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Customer Post(@ModelAttribute Customer customer) {
		return customerService.saveCustomer(customer);
	}

	@DeleteMapping(value = "/api/customer", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public void Delete(@RequestParam ObjectId _id) {
		customerService.deleteCustomer(_id);
	}
}
