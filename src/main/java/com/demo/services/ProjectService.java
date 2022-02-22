package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.domain.Project;
import com.demo.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project)
	{
		return projectRepository.save(project);
	}
}
