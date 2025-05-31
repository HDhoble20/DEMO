package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Customer> getCustomers() {
		Query query = entityManager.createQuery("from Customer");
		List<Customer> list = query.getResultList();
		return list;
	}

	@Override
	public Customer getCustomerById(int id) {

		return entityManager.find(Customer.class, id);
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// entityManager.persist(theCustomer);
		Customer customer = entityManager.merge(theCustomer);
		theCustomer.setId(customer.getId());

	}

	@Override
	public void deleteCustomer(Customer theCustomer) {
		entityManager.remove(theCustomer);

	}

}
