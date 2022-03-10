package com.softserveinc.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.softserveinc.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	
	UserDto createUser(UserDto user);

}
