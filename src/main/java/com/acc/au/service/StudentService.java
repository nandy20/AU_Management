package com.acc.au.service;

import java.util.Optional;

import com.acc.au.model.Student;

public interface StudentService {

	String save(Student obj);
	Optional<Student> fetch(Integer id);
}
