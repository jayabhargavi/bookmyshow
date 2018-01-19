package com.demo.bms.service;

import com.demo.bms.entity.UserDetails;

/**
 * This interface gives the operations that is performed on the UserDetails
 *
 */

public interface UserService {
	
	UserDetails getUserInfo(String userName);
	
	UserDetails getUserInfo(Integer userId);
	
	// UserDetials addUser(UserInfo user);

}
