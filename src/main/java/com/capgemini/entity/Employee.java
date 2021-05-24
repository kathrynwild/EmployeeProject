package com.capgemini.entity;

import javax.persistence.*;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "empId")
	private long empId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "salary")
	private double salary;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
    private Address address;

	@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(foreignKey = @ForeignKey(name = "projectId"),name = "projectId")
	@JoinColumn(name = "projectId")
	private Project project1;
	
	@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(foreignKey = @ForeignKey(name = "deptId"), name = "deptId")
	@JoinColumn(name = "deptId")
	private Dept department;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(long empId, String name, String designation, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Project getProject() {
		return project1;
	}

	public void setProject(Project project) {
		this.project1 = project;
	}

	public Dept getDept() {
		return department;
	}

	public void setDept(Dept dept) {
		this.department = dept;
	}

}
