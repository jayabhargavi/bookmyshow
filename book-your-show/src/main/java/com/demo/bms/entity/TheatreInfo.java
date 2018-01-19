package com.demo.bms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THEATRE_INFO")
public class TheatreInfo {
	
	@Id
	@Column(name = "THEATRE_ID")
	private Integer theatreId;
	
	@Column(name = "THEATRE_NAME")
	private String theatreName;

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	
}
