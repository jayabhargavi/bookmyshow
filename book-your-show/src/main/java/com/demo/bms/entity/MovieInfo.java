package com.demo.bms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_INFO")
public class MovieInfo {
	
	@Id
	@Column(name = "MOVIE_ID")
	private Integer movieId;
	
	@Column(name = "MOVIE_NAME")
	private String movieName;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
