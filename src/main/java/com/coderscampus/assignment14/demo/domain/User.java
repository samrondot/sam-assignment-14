package com.coderscampus.assignment14.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User {
	private Long userId;
	private String username;
	private List<Message> message = new ArrayList<>();
	private List<Channel> channel = new ArrayList<>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@OneToMany(mappedBy = "user")
	public List<Message> getMessage() {
		return message;
	}
	public void setMessage(List<Message> message) {
		this.message = message;
	}
	@ManyToMany(mappedBy = "users")
	@JsonIgnore
	public List<Channel> getChannel() {
		return channel;
	}
	public void setChannel(List<Channel> channel) {
		this.channel = channel;
	}
}

