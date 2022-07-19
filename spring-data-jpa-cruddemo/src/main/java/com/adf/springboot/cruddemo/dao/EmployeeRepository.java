package com.adf.springboot.cruddemo.dao;

import com.adf.springboot.cruddemo.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
