package com.usermanagement;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserManagementConfig {

	@Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}
