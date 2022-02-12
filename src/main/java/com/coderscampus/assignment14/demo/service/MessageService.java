package com.coderscampus.assignment14.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment14.demo.domain.Channel;
import com.coderscampus.assignment14.demo.domain.Message;
import com.coderscampus.assignment14.demo.domain.User;
import com.coderscampus.assignment14.demo.dto.messageDto;
import com.coderscampus.assignment14.demo.repository.MessageRepository;

@Service
public class MessageService {
@Autowired
private MessageRepository messageRepo;
@Autowired
private ChannelService channelService;
@Autowired
private UserService userService;

	
	public void createMessage(messageDto message, Long channelId) {
		Channel channel = new Channel();
		channel = channelService.findById(channelId);
		Message newMessage = new Message();
		channel = channelService.findById(channel.getChannelId());
		User user = new User();
		user = userService.findByUserId(message.getUserId());
		newMessage.setUser(user);
		newMessage.setMessage(message.getMessage());
		newMessage.setChannel(channel);
		messageRepo.save(newMessage);
		
	}	
}
