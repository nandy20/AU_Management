package com.acc.au.controller;

import com.acc.au.model.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.acc.au.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService service;

    @PostMapping
    public String login(@RequestBody LoginDTO loginDTO) {
        return service.login(loginDTO);
    }
}
