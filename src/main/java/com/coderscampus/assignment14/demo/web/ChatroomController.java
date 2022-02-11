package com.coderscampus.assignment14.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.assignment14.demo.domain.Channel;
import com.coderscampus.assignment14.demo.domain.Message;
import com.coderscampus.assignment14.demo.domain.User;
import com.coderscampus.assignment14.demo.dto.messageDto;
import com.coderscampus.assignment14.demo.service.ChannelService;
import com.coderscampus.assignment14.demo.service.UserService;

@Controller
public class ChatroomController {
	
	@Autowired
	private ChannelService channelService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/welcome")
	public String welcomePage(ModelMap model) {
		Channel channel = new Channel();
		List<Channel> channels = new ArrayList<>();
		channelService.createChannel(channel);
		model.put("channel", channel);
		model.put("channels", channels);
		return "welcome";
	}
	@ResponseBody
	@PostMapping("/welcome/createuser")
	public User createUser(@RequestBody String user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/channels/{channelId}")
		public String showChannels(ModelMap model, @PathVariable Long channelId) {
		Channel channel = channelService.findById(channelId);
		model.put("channel", channel);
		return "channels";
	}
	@ResponseBody
	@PostMapping("/messageSent/{channelId}")
		private messageDto messageReceived (@RequestBody messageDto message, @PathVariable Long channelId) {
		messageDto messageDto = new messageDto();
		messageDto.setChannelId(channelId);
		messageDto.setMessage(message.getMessage());
		messageDto.setUserId(message.getUserId());
		return messageDto;
	}
}
