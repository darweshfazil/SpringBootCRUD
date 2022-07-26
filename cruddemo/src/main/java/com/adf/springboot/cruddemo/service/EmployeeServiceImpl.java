package com.adf.springboot.cruddemo.service;

import java.util.List;

import com.adf.springboot.cruddemo.dao.EmployeeDAO;
import com.adf.springboot.cruddemo.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll(){
		return employeeDAO.findAll();
	}
	
	@Override
	@Transactional
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}
	
	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);
	}
	
	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);
	}
}
