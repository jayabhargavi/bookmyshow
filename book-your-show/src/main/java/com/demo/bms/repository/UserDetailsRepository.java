package com.demo.bms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Serializable>{
	
	UserDetails findByUserId(Integer userId);
	
	UserDetails findByUserName(String userName);

}
