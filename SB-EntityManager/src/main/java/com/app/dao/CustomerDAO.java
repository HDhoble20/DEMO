package com.app.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.app.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
	public Customer getCustomerById(int id);
	
	public void saveCustomer(Customer theCustomer);
	
	public void deleteCustomer(Customer theCustomer);

}
