package com.demo.bms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "SHOW_SCREENING")
@IdClass(ShowScreeningPK.class)
public class ShowScreening {
	
	@Id
	@Column(name = "MOVIE_ID")
	private Integer movieId;
	
	@Id
	@Column(name = "SCREEN_ID")
	private Integer screenId;
	
	@Id
	@Column(name = "SHOW_ID")
	private Integer showId;
	
	@Id
	@Column(name = "THEATRE_ID")
	private Integer theatreId;
	
	@Column(name = "SCREENING_FROM")
	private Date screeningFrom;
	
	@Column(name = "SCREENING_TO")
	private Date screeningTo;
	
	@Column(name = "SHOW_TIMINGS")
	private String showTimings;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	public Date getScreeningFrom() {
		return screeningFrom;
	}

	public void setScreeningFrom(Date screeningFrom) {
		this.screeningFrom = screeningFrom;
	}

	public Date getScreeningTo() {
		return screeningTo;
	}

	public void setScreeningTo(Date screeningTo) {
		this.screeningTo = screeningTo;
	}

	public String getShowTimings() {
		return showTimings;
	}

	public void setShowTimings(String showTimings) {
		this.showTimings = showTimings;
	}
	
}
