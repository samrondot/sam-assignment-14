package com.coderscampus.assignment14.demo.service;

import java.util.Optional;

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

	public Optional<User> findById(Long userId) {
		return userRepo.findById(userId);
	}

}
