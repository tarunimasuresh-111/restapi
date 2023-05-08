package com.example.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class customer {
	@Id
	public int customerId;
	public String customerName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id")
	public email email;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public email getEmail() {
		return email;
	}
	public void setEmail(email email) {
		this.email = email;
	}
	
}
