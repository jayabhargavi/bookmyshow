package com.demo.bms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.bms.entity.UserDetails;
import com.demo.bms.repository.UserDetailsRepository;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails getUserInfo(String userName) {
		return userDetailsRepository.findByUserName(userName);
	}

	@Override
	public UserDetails getUserInfo(Integer userId) {
		return userDetailsRepository.findByUserId(userId);
	}

}
