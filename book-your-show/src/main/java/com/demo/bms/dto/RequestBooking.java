
package com.demo.bms.dto;

import java.util.List;

public class RequestBooking {

	private String userName;
    private String movieName;
    private String theatreName;
    private String categoryName;
    private String showTiming;
    private Integer noOfSeats;
    private List<BookSeat> bookSeat = null;

    
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getShowTiming() {
        return showTiming;
    }

    public void setShowTiming(String showTiming) {
        this.showTiming = showTiming;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public List<BookSeat> getBookSeat() {
        return bookSeat;
    }

    public void setBookSeat(List<BookSeat> bookSeat) {
        this.bookSeat = bookSeat;
    }


}
