package com.coderscampus.assignment14.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.assignment14.demo.domain.User;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public String welcomePage (ModelMap model) {
		User user = new User();
		model.put("user", user);
		return "welcome";
		
	}
	@GetMapping("/channels")
	public String channels(ModelMap model) {
		return "channels";
	}
	
	
}
