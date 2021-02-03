package com.acc.au.service;

import java.util.Optional;

import com.acc.au.model.Trainer;

public interface LoginService {
    Optional<Trainer> Auth(String trainerusername);
}
