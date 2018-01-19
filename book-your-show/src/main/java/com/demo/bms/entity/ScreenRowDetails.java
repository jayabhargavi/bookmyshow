package com.demo.bms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ScreenRowDetailsPK.class)
@Table(name = "SCREEN_ROW_DETAILS")
public class ScreenRowDetails {
	
	@Id
	@Column(name = "SEAT_ID")
	private Integer seatId;
	
	@Id
	@Column(name = "ROW_ID")
	private String rowId;
	
	@Id
	@Column(name = "SCREEN_ID")
	private Integer screenId;
	
	@Id
	@Column(name = "SHOW_ID")
	private Integer showId;
	
	@Id
	@Column(name = "THEATRE_ID")
	private Integer theatreId;
	
	//@Id
	@Column(name = "CATEGORY_ID")
	private Integer categoryId;
	
	
	@Column(name = "M_DATE")
	private Date date;
	
	@Column(name = "SEAT_STATUS")
	private String seatStatus;

	public Integer getSeatId() {
		return seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
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

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
	}
	
}
