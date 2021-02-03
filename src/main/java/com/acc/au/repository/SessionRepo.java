package com.acc.au.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.au.model.Session;

public interface SessionRepo extends JpaRepository<Session,Integer> {

}
