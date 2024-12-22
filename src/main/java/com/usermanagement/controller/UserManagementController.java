package com.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	
		@PostMapping("add")
		public ResponseEntity<UserManagementDTO> addUser(@RequestBody UserManagementDTO userDto) {

			return ResponseEntity.ok(userManagementService.addUser(userDto));
		}

		@GetMapping("{id}")
		public ResponseEntity<UserManagementDTO> getUser(@PathVariable(name = "id") long id) {

			return ResponseEntity.ok(userManagementService.getUser(id));
		}
}
