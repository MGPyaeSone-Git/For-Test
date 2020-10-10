package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Employee;
import com.example.demo.respority.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	 public List<Employee> getAllEmployees() {
		 return employeeRepository.findAll();
	 }
	
	 public Employee createEmployee(@Validated @RequestBody Employee employee) {
		 return employeeRepository.save(employee);
	 }
}
