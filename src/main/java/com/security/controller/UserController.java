package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.UserInfo;
import com.security.service.UserInfoService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@PostMapping("/create/user")
	public UserInfo create(@RequestBody UserInfo userInfo) {
		return userInfoService.create(userInfo);
	}

}
