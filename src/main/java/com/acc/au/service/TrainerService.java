package com.acc.au.service;

import java.util.Optional;

import com.acc.au.model.Trainer;

public interface TrainerService {
    String save(Trainer obj);
    Optional<Trainer> fetch(Integer id);
}
