package com.demo.bms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.TheatreInfo;

@Repository
public interface TheatreRepository extends JpaRepository<TheatreInfo, Serializable>{
	
	TheatreInfo findByTheatreName(String theatreName);
}
