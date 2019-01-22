package com.onuryahsi.demo.mongoDbApp.Service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onuryahsi.demo.mongoDbApp.Interface.IEmployeeService;
import com.onuryahsi.demo.mongoDbApp.Model.Employee;
import com.onuryahsi.demo.mongoDbApp.Repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository repository) {
		this.employeeRepository = repository;
	}

	@Override
	public Iterable<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmplooyeById(ObjectId _id) {
		// TODO Auto-generated method stub
		return employeeRepository.findBy_id(_id);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(ObjectId _id) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.findBy_id(_id);
		employeeRepository.delete(employee);
	}

}
