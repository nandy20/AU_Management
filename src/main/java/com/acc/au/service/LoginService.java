package com.acc.au.service;

import java.util.Optional;

import com.acc.au.model.Trainer;

public interface LoginService {
    Trainer Auth(String trainerusername,String trainerpassword);
}
