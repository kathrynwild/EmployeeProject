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

import com.capgemini.entity.Project;
import com.capgemini.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@GetMapping("/projects")
	public List<Project> getAllProjectDetails(){
		return projectService.getAllProjectDetails();
	}
	
	@GetMapping("/project/{projectId}")
	public Optional<Project> getProjectById(@PathVariable long projectId) {
		return projectService.getProjectById(projectId);
	}
	
	@PostMapping("/project")
	public Project addProject(@RequestBody Project project) {
		return projectService.addProject(project);
	}
	
	@DeleteMapping("/project/{projectId}")
	public void deleteEmployee(@PathVariable long projectId) {
		projectService.deleteProject(projectId);
	}
	
	@PutMapping("/project/{projectId}")
	public Project updateProject(@PathVariable long projectId, @RequestBody Project project) {
		return projectService.updateProject(projectId, project);
	}

}
