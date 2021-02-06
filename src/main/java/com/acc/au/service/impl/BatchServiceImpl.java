package com.acc.au.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Batch;
import com.acc.au.repository.BatchRepo;
import com.acc.au.service.BatchService;
@Service
public class BatchServiceImpl implements BatchService{

	@Autowired
	BatchRepo repo;
	
	@Override
	public String save(Batch obj) {
		repo.save(obj);
		return "success";
	}

	@Override
	public Optional<Batch> fetch(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Batch> fetchAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
