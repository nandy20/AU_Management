package com.acc.au.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.au.model.Project;

public interface ProjectRepo extends JpaRepository<Project,Integer>{

}
