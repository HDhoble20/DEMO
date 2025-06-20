package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

//@RepositoryRestResource(path = "/magic")
@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
