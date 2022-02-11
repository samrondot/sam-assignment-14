package com.coderscampus.assignment14.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment14.demo.domain.User;
import com.coderscampus.assignment14.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public User createUser(String user) {
		User newUser = new User();
		newUser.setUsername(user);
		return userRepo.save(newUser);
	}
}
