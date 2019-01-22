package com.onuryahsi.demo.mongoDbApp.Interface;

import org.bson.types.ObjectId;

import com.onuryahsi.demo.mongoDbApp.Model.Employee;

public interface IEmployeeService {

	Iterable<Employee> getAllEmployees();

	Employee getEmplooyeById(ObjectId _id);

	Employee saveEmployee(Employee employee);

	void deleteEmployee(ObjectId _id);

}
