package com.coderscampus.assignment14.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.coderscampus.assignment14.demo.domain.User;
import com.coderscampus.assignment14.demo.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/welcome/createuser")
	@ResponseBody
	public User welcome (@RequestBody String user) {
		User newUser = new User();
		System.out.println(user);
		newUser.setUsername(user);
		userService.createUser(newUser);
		System.out.println(newUser.getMessage());
		return newUser;
	}
}
