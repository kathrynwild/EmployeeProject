package com.capgemini.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Dept;
import com.capgemini.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	@GetMapping("/depts")
	public List<Dept> getAllDeptDetails(){
		return deptService.getAllDeptDetails();
	}
	
	@GetMapping("/dept/{deptId}")
	public Optional<Dept> getDeptById(@PathVariable long deptId) {
		return deptService.getDeptById(deptId);
	}
	
	@PostMapping("/dept")
	public Dept addDept(@RequestBody Dept dept) {
		return deptService.addDept(dept);
	}
	
	@DeleteMapping("/dept/{deptId}")
	public void deleteEmployee(@PathVariable long deptId) {
		deptService.deleteDept(deptId);
	}
	
	@PutMapping("/dept/{deptId}")
	public Dept updateDept(@PathVariable long deptId, @RequestBody Dept dept) {
		return deptService.updateDept(deptId, dept);
	}

}
