package com.acc.au.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.au.model.Trainer;

public interface TrainerRepo extends JpaRepository<Trainer,Integer> {

}
