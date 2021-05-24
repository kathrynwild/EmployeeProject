package com.capgemini.entity;

import java.util.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="dept")
public class Dept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "deptId")
	private long deptId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy="department", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
    private Set<Employee> employees = new HashSet<Employee>();
	
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
