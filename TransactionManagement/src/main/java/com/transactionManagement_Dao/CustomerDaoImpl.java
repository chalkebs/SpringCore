package com.transactionManagement_Dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.transactionManagement_model.Customer;

public class CustomerDaoImpl implements CustomerDao
{
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
	}

	public void create(Customer customer) 
	{
		String queryCustomer = "insert into Customer (name) values (?)";
		String queryAddress = "insert into Address (address,country) values (?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(queryCustomer, new Object[] { customer.getName() });
		
		System.out.println("Inserted into Customer Table Successfully");
		
		jdbcTemplate.update(queryAddress, new Object[] { customer.getAddress().getAddress(),
				customer.getAddress().getCountry() });
		
		System.out.println("Inserted into Address Table Successfully");
	}

}
