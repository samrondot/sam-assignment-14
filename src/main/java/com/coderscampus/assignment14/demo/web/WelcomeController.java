package com.coderscampus.assignment14.demo.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coderscampus.assignment14.demo.domain.Channel;
import com.coderscampus.assignment14.demo.domain.User;
import com.coderscampus.assignment14.demo.service.ChannelService;

@Controller
public class WelcomeController {
	
	@Autowired
	private ChannelService channelService;
	
	@GetMapping("/welcome")
	public String welcomePage (ModelMap model) {
		User user = new User();
		Channel channel = new Channel();
		if(channel.getId() == null) {
			channelService.createChannel(channel);
		}
		model.put("user", user);
		model.put("channel", channel);
		return "welcome";
		
	}
	@GetMapping("/channels/{channelId}")
	public String channels(ModelMap model, @PathVariable Long channelId) {
		Optional<Channel> channel = channelService.findById(channelId);
		model.put("channel", channel);
		return "channels";
	}
	
	
}
