package com.demo.bms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHOW_DETAILS")
public class ShowDetails {
	
	@Id
	@Column(name = "SHOW_ID")
	private Integer showId;
	
	@Column(name = "SHOW_NAME")
	private String showName;
	
	@Column(name = "SHOW_TIME")
	private String showTime;

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
	
	
	

}
