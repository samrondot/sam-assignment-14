package com.coderscampus.assignment14.demo.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.assignment14.demo.domain.Channel;
import com.coderscampus.assignment14.demo.domain.Message;
import com.coderscampus.assignment14.demo.service.ChannelService;
import com.coderscampus.assignment14.demo.service.MessageService;

@Controller
public class MessageController {
	@Autowired
	private MessageService messageService;
	@Autowired
	private ChannelService channelService;
	
	@PostMapping("/messageSent/{channelId}")
	@ResponseBody
	private Message messageReceived(@RequestBody String message, @PathVariable Long channelId) {
		Message messages = new Message();
		messages.setMessage(message);
		Channel channel = new Channel();
		channel = channelService.findById(channelId);
		messageService.createMessage(messages, channel);
		return messages;
	}

}
