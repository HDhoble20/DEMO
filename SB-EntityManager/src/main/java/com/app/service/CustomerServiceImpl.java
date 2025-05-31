package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDAO;
import com.app.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO customerDAO;

	public CustomerServiceImpl(CustomerDAO customerDAO) {
		super();
		this.customerDAO = customerDAO;
	}

	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerDAO.getCustomerById(id);
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public void deleteCustomer(Customer theCustomer) {
		customerDAO.deleteCustomer(theCustomer);
	}
}
