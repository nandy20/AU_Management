package com.acc.au.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.au.model.Session;

public interface SessionRepo extends JpaRepository<Session,Integer> {
     List<Session> findByBatchid(Integer batchid);
    
	List<Session> findByTrainerid(Integer trainerid);
}
