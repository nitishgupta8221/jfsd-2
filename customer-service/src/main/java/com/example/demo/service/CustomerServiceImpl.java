package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public CustomerServiceImpl(CustomerDao customerDao) {
	this.customerDao = customerDao;
}

	@Override
	@Transactional
	public Iterable<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	@Transactional
	public Optional<Customer> findCustomerById(String customerId) {
		// TODO Auto-generated method stub
		return customerDao.findById(customerId);
	}

}
