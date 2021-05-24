package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.entity.Dept;
import com.capgemini.repo.DeptRepo;

public class DeptServiceImpl implements DeptService{
	
	@Autowired 
	DeptRepo deptRepo;
	
	@Override
	public List<Dept> getAllDeptDetails() {
		return deptRepo.findAll();
	}
	
	@Override
	public Optional<Dept> getDeptById(long deptId) {
		return deptRepo.findById(deptId);
	}

	@Override
	public Dept addDept(Dept dept) {
        return deptRepo.save(dept);
	}
	
	@Override
	public void deleteDept(long deptId) {
		deptRepo.deleteById(deptId);
	}
	
	@Override
	public Dept updateDept(long deptId, Dept dept) {
		deptRepo.deleteById(deptId);
		return deptRepo.save(dept);
	}

}
