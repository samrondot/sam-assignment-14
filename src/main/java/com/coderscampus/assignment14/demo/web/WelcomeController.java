package com.coderscampus.assignment14.demo.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coderscampus.assignment14.demo.domain.Channel;
import com.coderscampus.assignment14.demo.domain.Message;
import com.coderscampus.assignment14.demo.domain.User;
import com.coderscampus.assignment14.demo.service.ChannelService;
import com.coderscampus.assignment14.demo.service.UserService;

@Controller
public class WelcomeController {
	
	@Autowired
	private ChannelService channelService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/welcome")
	public String welcomePage (ModelMap model) {
		User user = new User();
		Channel channel = new Channel();
		channelService.createChannel(channel);
		model.put("user", user);
		model.put("channel", channel);
		return "welcome";
		
	}
	@GetMapping("/channels/{channelId}")
	public String channels(ModelMap model, @PathVariable Long channelId) {
		Channel channel = channelService.findById(channelId);
		Message message = new Message();
		model.put("channel", channel);
		model.put("message", message);
		return "channels";
	}
	
	
}
