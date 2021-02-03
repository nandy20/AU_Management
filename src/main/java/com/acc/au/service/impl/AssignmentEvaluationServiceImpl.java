package com.acc.au.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.AssignmentEvaluation;
import com.acc.au.repository.AssignmentEvaluationRepo;
import com.acc.au.service.AssignmentEvaluationService;
@Service
public class AssignmentEvaluationServiceImpl implements AssignmentEvaluationService{

	@Autowired
	AssignmentEvaluationRepo repo;
	@Override
	public String save(AssignmentEvaluation obj) {
		repo.save(obj);
		return "success";
	}

}
