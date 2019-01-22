package com.onuryahsi.demo.mongoDbApp.Model;

import javax.persistence.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class Customer {

	@Id
	private ObjectId _id;
	private String companyName;
	private String contactName;
	private String customerAddress;
	private String customerCity;
	private String customerPhone;
	private String customerDescription;

	public Customer(String companyName, String contactName, String customerAddress, String customerCity,
			String customerPhone, String customerDescription) {
		this.companyName = companyName;
		this.contactName = contactName;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerPhone = customerPhone;
		this.customerDescription = customerDescription;
	}

	public String getCustomerID() {
		return _id.toHexString();
	}

	public void setCustomerID(ObjectId _id) {
		this._id = _id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_id == null) ? 0 : _id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (_id == null) {
			if (other._id != null)
				return false;
		} else if (!_id.equals(other._id))
			return false;
		return true;
	}

}
