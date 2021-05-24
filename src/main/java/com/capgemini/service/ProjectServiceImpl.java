package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.entity.Project;
import com.capgemini.repo.ProjectRepo;

public class ProjectServiceImpl implements ProjectService{
	
	@Autowired 
	ProjectRepo projectRepo;
	
	@Override
	public List<Project> getAllProjectDetails() {
		return projectRepo.findAll();
	}
	
	@Override
	public Optional<Project> getProjectById(long projectId) {
		return projectRepo.findById(projectId);
	}

	@Override
	public Project addProject(Project project) {
        return projectRepo.save(project);
	}
	
	@Override
	public void deleteProject(long projectId) {
		projectRepo.deleteById(projectId);
	}
	
	@Override
	public Project updateProject(long projectId, Project project) {
		projectRepo.deleteById(projectId);
		return projectRepo.save(project);
	}

}
