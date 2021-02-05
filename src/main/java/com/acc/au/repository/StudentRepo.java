package com.acc.au.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.au.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    

	List<Student> findByBatchid(Integer batchid);
}
