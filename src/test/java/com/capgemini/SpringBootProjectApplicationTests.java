package com.capgemini;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.entity.Address;
import com.capgemini.entity.Dept;
import com.capgemini.entity.Employee;
import com.capgemini.entity.Project;
import com.capgemini.repo.DeptRepo;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.repo.ProjectRepo;

@SpringBootTest
class SpringBootProjectApplicationTests {
	
	@Autowired
	EmployeeRepo empRepo;
	
	@Autowired
	DeptRepo deptRepo;
	
	@Autowired
	ProjectRepo projectRepo;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testCreateDept() {
		Dept dept1 = new Dept();
		//dept1.setDeptId(1000000001);
		dept1.setTitle("ADM");
		dept1.setDescription("Application Development Management");
		
		Project project1 = new Project();
		//project1.setProjectId(101);
		project1.setName("training");
		project1.setDescription("May 2021");
		
		Address address1 = new Address();
		address1.setId(101);
		address1.setCity("Chicago");
		address1.setPincode("52240");
		
		Set<Employee> employees = new HashSet<Employee>();
		
		Employee emp1 = new Employee();
		//emp1.setEmpId(101);
		emp1.setName("Kat");
		emp1.setDesignation("Engineer");
		emp1.setSalary(150000);
		emp1.setDept(dept1);
		emp1.setProject(project1);
		emp1.setAddress(address1);
		
		Employee emp2 = new Employee();
		//emp2.setEmpId(102);
		emp2.setName("Ella");
		emp2.setDesignation("Banking");
		emp2.setSalary(50000);
		emp2.setDept(dept1);
		
		emp2.setProject(project1);
		emp2.setAddress(address1);
		
		employees.add(emp1);
		employees.add(emp2);
		
		//dept1.setEmployees(employees);
		//deptRepo.save(dept1);
		
		//project1.setEmployees(employees);
		//projectRepo.save(project1);
		
		//empRepo.save(emp1);
		//empRepo.save(emp2);
	}
}

	
	/*
	@Test
	public void testCreateProject() {
		Project project1 = new Project();
		project1.setProjectId("101");
		project1.setName("training");
		project1.setDescription("May 2021");
		
		HashSet<Employee> employees = new HashSet<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setEmpId("101");
		emp1.setName("Kat");
		emp1.setDesignation("Engineer");
		emp1.setSalary(150000);
		emp1.setProject(project1);
		
		Employee emp2 = new Employee();
		emp2.setEmpId("102");
		emp2.setName("Ella");
		emp2.setDesignation("Banking");
		emp2.setSalary(50000);
		emp2.setProject(project1);
		
		employees.add(emp1);
		employees.add(emp2);
		
		project1.setEmployees(employees);
		projectRepo.save(project1);
	}
	
	@Test
	public void testCreateAddress() {
		Address address1 = new Address();
		address1.setId("101");
		address1.setCity("Chicago");
		address1.setPincode("52240");
		
		Employee emp1 = new Employee();
		emp1.setEmpId("101");
		emp1.setName("Kat");
		emp1.setDesignation("Engineer");
		emp1.setSalary(150000);
		emp1.setAddress(address1);
		
		empRepo.save(emp1);
	}
}


{
"empId": "101", "name": "Kat",  "designation": "Engineer", "salary": 150000,
"dept":{
    "deptId": 101, "title": "ADM", "description": "Application Development Management"
}, 
"project": {
    "projectId": 101, "name": "training", "description": "May 2021"
}  ,
"address": {
    "id": "101", "city": "Chicago", "pincode": "52240"
}
}






CREATE TABLE public.dept(
  deptId bigint auto_increment,
  title varchar(50),
  description varchar(255),
  PRIMARY KEY (deptId)
);

CREATE TABLE public.project (
  projectId bigint auto_increment,
  name varchar(50),
  description varchar(255),
  PRIMARY KEY (projectId)
);

CREATE TABLE public.employee(
  empId bigint auto_increment,
  name varchar(30),
  designation varchar(30),
  salary double,
  address varchar(255),
  deptId bigint NOT NULL,
  projectId bigint NOT NULL,
  addressId bigint NOT NULL,
  PRIMARY KEY (empId),
  FOREIGN KEY (deptId) REFERENCES public.dept(deptId),
  FOREIGN KEY (projectId) REFERENCES public.project(projectId),
  FOREIGN KEY (addressId) REFERENCES public.address(addressId)
);

ALTER TABLE public.project AUTO_INCREMENT=1001;
*/