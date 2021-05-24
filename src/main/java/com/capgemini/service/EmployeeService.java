package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployeeDetails();

	Optional<Employee> getEmployeeById(long empId);

	Employee addEmployee(Employee emp);

	void deleteEmployee(long empId);

	Employee updateEmployee(long empId, Employee employee);

}