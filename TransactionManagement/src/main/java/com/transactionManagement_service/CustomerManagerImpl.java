package com.transactionManagement_service;

import org.springframework.transaction.annotation.Transactional;

import com.transactionManagement_Dao.CustomerDao;
import com.transactionManagement_model.Customer;

public class CustomerManagerImpl implements CustomerManager
{
	private CustomerDao customerDAO;

	public void setCustomerDAO(CustomerDao customerDAO) 
	{
		this.customerDAO = customerDAO;
	}

	@Transactional
	public void createCustomer(Customer cust) 
	{
		customerDAO.create(cust);
	}
}
