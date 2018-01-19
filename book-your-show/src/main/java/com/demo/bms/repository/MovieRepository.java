package com.demo.bms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.MovieInfo;

@Repository
public interface MovieRepository extends JpaRepository<MovieInfo, Serializable>{
	
	MovieInfo findByMovieName(String movieName);

}
