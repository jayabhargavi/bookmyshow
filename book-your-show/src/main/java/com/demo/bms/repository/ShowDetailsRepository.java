package com.demo.bms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.ShowDetails;

@Repository
public interface ShowDetailsRepository extends JpaRepository<ShowDetails, Serializable>{

	ShowDetails findByShowTime(String showTiming);

}
