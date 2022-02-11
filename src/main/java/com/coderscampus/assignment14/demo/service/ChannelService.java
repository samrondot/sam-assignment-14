package com.coderscampus.assignment14.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment14.demo.domain.Channel;
import com.coderscampus.assignment14.demo.repository.ChannelRepository;

@Service
public class ChannelService {
	@Autowired
	private ChannelRepository channelRepo;

	public void createChannel(Channel channel) {
		channelRepo.save(channel);
	}

	public Channel findById(Long channelId) {
		return channelRepo.findByChannelId(channelId);
	}
}
