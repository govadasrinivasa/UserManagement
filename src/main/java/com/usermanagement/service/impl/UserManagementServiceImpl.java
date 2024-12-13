package com.usermanagement.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanagement.dto.UserManagementDTO;
import com.usermanagement.entity.Users;
import com.usermanagement.repository.UserManagementRepository;
import com.usermanagement.service.UserManagementService;

@Service
public class UserManagementServiceImpl implements UserManagementService {

    private ModelMapper mapper;
	@Autowired
	private UserManagementRepository userManagementRepo;
	
	public UserManagementServiceImpl(UserManagementRepository userManagementRepo, ModelMapper mapper) {
		this.userManagementRepo = userManagementRepo;
		this.mapper = mapper;
	}

	@Override
	public void register(UserManagementDTO userManagementDTO) {
		if(userManagementDTO != null) {
			Users users = mapper.map(userManagementDTO, Users.class);
			userManagementRepo.save(users);
		}
	}

	@Override
	public UserManagementDTO login(String username, String password) {
		UserManagementDTO userManagementDTO = null;
		if(!username.equals("") && !password.equals("")) {
			Users users = userManagementRepo.findUserByUsername(username, password);
			userManagementDTO = mapper.map(users, UserManagementDTO.class);
		}
		return userManagementDTO;
	}

}
