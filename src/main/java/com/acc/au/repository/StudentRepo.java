package com.acc.au.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.au.model.Student;
import com.acc.au.model.Trainer;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    
	Student findByStudentUsername(String studentUsername);
	List<Student> findByBatchid(Integer batchid);
}
