package com.usermanagement.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import com.usermanagement.dto.UserManagementDTO;
import com.usermanagement.entity.User;
import com.usermanagement.exception.DuplicateRecordException;
import com.usermanagement.repository.UserManagementRepository;
import com.usermanagement.service.UserManagementService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
	private ModelMapper mapper;
    
    @Autowired
	private UserManagementRepository userManagementRepo;
    
    private Collection<? extends GrantedAuthority> authorities;
	
	public void register(UserManagementDTO userManagementDTO) {
		if(userManagementDTO != null) {
			User user = mapper.map(userManagementDTO, User.class);
			userManagementRepo.save(user);
		}
	}

	@Override
	public UserManagementDTO addUser(UserManagementDTO userManagementDTO) {
		if (userManagementRepo.existsByMobile(userManagementDTO.getMobile())) {
			throw new DuplicateRecordException("User Already Exists with Mobile: " + userManagementDTO.getMobile());
		}
		User user = mapper.map(userManagementDTO, User.class);
		user = userManagementRepo.save(user);
		return userManagementDTO;
	}

	@Override
	public UserManagementDTO getUser(long id) {
		Optional<User> user = userManagementRepo.findById(id);

		if (!user.isPresent()) {
			throw new EntityNotFoundException("User Not Found with ID: " + id);
		}

		return mapper.map(user, UserManagementDTO.class);
	}

}
