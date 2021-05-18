package com.capgemini.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.Dept;

public interface DeptRepo extends JpaRepository<Dept, String>{

}
