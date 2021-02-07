package com.acc.au.service;

import java.util.List;
import java.util.Optional;

import com.acc.au.model.Project;
import com.acc.au.model.Session;

public interface ProjectService {
    String save(Project obj);
    Optional<Project> fetch(Integer id);
    List<Project>fetchAll();
}
