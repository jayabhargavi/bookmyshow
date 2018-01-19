package com.demo.bms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.ScreenDetails;

@Repository
public interface ScreenDetailsRepository extends JpaRepository<ScreenDetails, Serializable>{

}
