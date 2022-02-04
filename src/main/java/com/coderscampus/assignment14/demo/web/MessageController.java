package com.coderscampus.assignment14.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.assignment14.demo.domain.Message;
import com.coderscampus.assignment14.demo.service.MessageService;

@Controller
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	
	
	@PostMapping("/messageSent")
	@ResponseBody
	private Message messageReceived(@RequestBody String message) {
		Message messages = new Message();
		messages.setMessage(message);
		messageService.createMessage(messages);
		return messages;
	}

}
