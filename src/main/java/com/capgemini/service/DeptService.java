package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.entity.Dept;

public interface DeptService {
	
	List<Dept> getAllDeptDetails();

	Optional<Dept> getDeptById(long deptId);

	Dept addDept(Dept dept);

	void deleteDept(long deptId);

	Dept updateDept(long deptId, Dept dept);

}
