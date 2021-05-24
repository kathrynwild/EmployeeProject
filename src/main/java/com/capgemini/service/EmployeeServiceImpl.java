package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Employee;
import com.capgemini.repo.EmployeeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getAllEmployeeDetails() {
		return employeeRepo.findAll();
	}
	
	@Override
	public Optional<Employee> getEmployeeById(long empId) {
		return employeeRepo.findById(empId);
	}

	@Override
	public Employee addEmployee(Employee emp) {
        return employeeRepo.save(emp);
	}
	
	@Override
	public void deleteEmployee(long empId) {
		employeeRepo.deleteById(empId);
	}
	
	@Override
	public Employee updateEmployee(long empId, Employee employee) {
		employeeRepo.deleteById(empId);
		return employeeRepo.save(employee);
	}
}
