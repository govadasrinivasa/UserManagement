package com.usermanagement.service;

import com.usermanagement.dto.UserManagementDTO;

public interface UserManagementService {

	UserManagementDTO addUser(UserManagementDTO userManagementDTO);

	UserManagementDTO getUser(long id);
}
