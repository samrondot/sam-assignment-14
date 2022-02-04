package com.coderscampus.assignment14.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment14.demo.domain.Message;
import com.coderscampus.assignment14.demo.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository messageRepo;

	public void createMessage(Message message) {
		messageRepo.save(message);
		
	}

}
