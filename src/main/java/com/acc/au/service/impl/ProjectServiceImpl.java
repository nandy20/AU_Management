package com.acc.au.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Project;
import com.acc.au.repository.BatchRepo;
import com.acc.au.repository.ProjectRepo;
import com.acc.au.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectRepo repo;
	
	@Override
	public String save(Project obj) {
		repo.save(obj);
		return "success";
	}

}
