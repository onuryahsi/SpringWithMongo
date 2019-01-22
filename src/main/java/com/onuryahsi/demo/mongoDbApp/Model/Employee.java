package com.onuryahsi.demo.mongoDbApp.Model;

import javax.persistence.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {
	@Id
	private ObjectId _id;
	private String employeeTC;
	private String employeeName;
	private String employeeSurname;
	private String employeeAddress;
	private String employeePhone;

	public Employee(String employeeTC, String employeeName, String employeeSurname, String employeeAddress,
			String employeePhone) {
		this.employeeTC = employeeTC;
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id.toHexString();
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @return the employeeTC
	 */
	public String getEmployeeTC() {
		return employeeTC;
	}

	/**
	 * @param employeeTC the employeeTC to set
	 */
	public void setEmployeeTC(String employeeTC) {
		this.employeeTC = employeeTC;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeSurname
	 */
	public String getEmployeeSurname() {
		return employeeSurname;
	}

	/**
	 * @param employeeSurname the employeeSurname to set
	 */
	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	/**
	 * @return the employeeAddress
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}

	/**
	 * @param employeeAddress the employeeAddress to set
	 */
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	/**
	 * @return the employeePhone
	 */
	public String getEmployeePhone() {
		return employeePhone;
	}

	/**
	 * @param employeePhone the employeePhone to set
	 */
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

}
