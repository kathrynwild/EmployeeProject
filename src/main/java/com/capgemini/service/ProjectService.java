package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.entity.Project;

public interface ProjectService {
	
	List<Project> getAllProjectDetails();

	Optional<Project> getProjectById(long empId);

	Project addProject(Project emp);

	void deleteProject(long empId);

	Project updateProject(long empId, Project Project);

}
