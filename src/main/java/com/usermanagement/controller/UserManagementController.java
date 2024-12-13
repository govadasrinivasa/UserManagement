package com.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.dto.UserManagementDTO;
import com.usermanagement.service.impl.UserManagementServiceImpl;

@RestController
@RequestMapping("/um")
public class UserManagementController {

	@Autowired
	UserManagementServiceImpl userManagementService;
	
	@PostMapping("/register")
	public void register(@RequestBody UserManagementDTO userManagementDTO) {
		userManagementService.register(userManagementDTO);
	}
	
	@GetMapping("login/{id}")
	public UserManagementDTO login(@PathVariable("username") String username, @PathVariable("password") String password) {
		UserManagementDTO userManagementDTO = userManagementService.login(username, password);
		return userManagementDTO;
	}
}
