package com.acc.au.service;

import java.util.List;
import java.util.Optional;

import com.acc.au.model.Batch;

public interface BatchService {
     String save(Batch obj);

	Optional<Batch> fetch(Integer id);
	List <Batch>fetchAll();
}
