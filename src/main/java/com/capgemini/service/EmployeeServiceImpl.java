package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Employee;
import com.capgemini.repo.DeptRepo;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.repo.ProjectRepo;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired 
	DeptRepo deptRepo;
	
	@Autowired
	ProjectRepo projectRepo;
	
	@Override
	public List<Employee> getAllEmployeeDetails() {
		return employeeRepo.findAll();
	}
	
	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		return employeeRepo.findById(empId);
	}

	@Override
	public Employee addEmployee(Employee emp) {
        deptRepo.save(emp.getDept());
        projectRepo.save(emp.getProject());
        return employeeRepo.save(emp);
	}
	
	@Override
	public void deleteEmployee(String empId) {
		employeeRepo.deleteById(empId);
	}
	
	@Override
	public Employee updateEmployee(String empId, Employee employee) {
		employeeRepo.deleteById(empId);
		return employeeRepo.save(employee);
	}
}
