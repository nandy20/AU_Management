package com.acc.au.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Project;
import com.acc.au.model.Session;
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

	@Override
	public Optional<Project> fetch(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Project> fetchAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
