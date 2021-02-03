package com.acc.au.service;

import java.util.Optional;

import com.acc.au.model.Session;

public interface SessionService {

	String save (Session obj);
	Optional<Session> fetch(Integer id);
}
