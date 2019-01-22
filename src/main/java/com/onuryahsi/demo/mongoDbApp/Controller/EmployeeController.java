package com.onuryahsi.demo.mongoDbApp.Controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onuryahsi.demo.mongoDbApp.Model.Employee;
import com.onuryahsi.demo.mongoDbApp.Service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService service) {
		this.employeeService = service;
		//employeeService.saveEmployee(new Employee("q","q","q","q","q"));
	}

	@GetMapping(value = "/api/employee")
	public List<Employee> Get() {
		return (List<Employee>) employeeService.getAllEmployees();
	}

	@GetMapping(value = "/api/employee/{_Id}")
	public Employee Get(@RequestParam ObjectId _id) {
		return employeeService.getEmplooyeById(_id);
	}

	@PostMapping(value = "/api/employee", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Employee Post(@ModelAttribute Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@DeleteMapping(value = "/api/employee", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)

	public void Delete(@RequestParam ObjectId _id) {
		employeeService.deleteEmployee(_id);
	}
}
