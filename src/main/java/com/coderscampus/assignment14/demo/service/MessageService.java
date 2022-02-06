package com.coderscampus.assignment14.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment14.demo.domain.Channel;
import com.coderscampus.assignment14.demo.domain.Message;
import com.coderscampus.assignment14.demo.repository.ChannelRepository;
import com.coderscampus.assignment14.demo.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository messageRepo;
	@Autowired 
	private ChannelRepository channelRepo;

	public void createMessage(Message message, Channel channel) {
		channel.getMessage().add(message);
		message.setChannel(channel);
		channelRepo.save(channel);
		messageRepo.save(message);
		
	}

}
