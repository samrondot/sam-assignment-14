package com.coderscampus.assignment14.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment14.demo.domain.User;
import com.coderscampus.assignment14.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public void createUser(User newUser) {
		userRepo.save(newUser);
		
	}

}
