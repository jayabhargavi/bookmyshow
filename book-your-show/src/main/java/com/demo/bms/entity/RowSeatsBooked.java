package com.demo.bms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(RowSeatsBookedPK.class)
@Table(name= "ROW_SEATS_BOOKED")
public class RowSeatsBooked {
	
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
	
	@Id
	@Column(name = "BOOKING_ID")
	private Integer bookingId;

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

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

}
