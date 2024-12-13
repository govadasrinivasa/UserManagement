package com.usermanagement.service;

import com.usermanagement.dto.UserManagementDTO;

public interface UserManagementService {

	void register(UserManagementDTO userManagementDTO);
	UserManagementDTO login(String username, String password);
}
