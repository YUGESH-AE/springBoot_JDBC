package com.example.Spring_Boot_JDBC.service;

import com.example.Spring_Boot_JDBC.dto.CustomerDTO;
import com.example.Spring_Boot_JDBC.entity.Customer;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Transactional
public interface CustomerService {

    public void insert(CustomerDTO customerDTO);

    public int delete(Long phone);

    public List<Customer> selectAllCustomers();

    public int getNumberOfCustomers();

    public int updateCustomer(Long phoneNo, String address);

    public Customer get(Long phoneNo);


    public int TransactionalUpdateCustomer(Customer customer, Integer localRate, Integer nationalRate);

    public String inertPrepareCall(CustomerDTO customer) throws SQLException;
}
