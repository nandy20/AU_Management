package com.acc.au.service;

import java.util.List;
import java.util.Optional;

import com.acc.au.model.Student;

public interface StudentService {

	String save(Student obj);
	Optional<Student> fetch(Integer id);
	List<Student>FetchBasedOnBatch(Integer batchid);
}
