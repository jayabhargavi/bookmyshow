
package com.demo.bms.dto;

import java.util.List;

public class BookingResponse {

	private String userName;
	private Integer bookingId;
    private String movieName;
    private String theatreName;
    private String categoryName;
    private double pricePaid;
    private String showTiming;
    private Integer screenId;
    private List<BookSeat> bookSeat = null;
    private String message;

    
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

    public List<BookSeat> getBookSeat() {
        return bookSeat;
    }

    public void setBookSeat(List<BookSeat> bookSeat) {
        this.bookSeat = bookSeat;
    }

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getPricePaid() {
		return pricePaid;
	}

	public void setPricePaid(double pricePaid) {
		this.pricePaid = pricePaid;
	}

	@Override
	public String toString() {
		return "BookingResponse [userName=" + userName + ", bookingId=" + bookingId + ", movieName=" + movieName
				+ ", theatreName=" + theatreName + ", categoryName=" + categoryName + ", pricePaid=" + pricePaid
				+ ", showTiming=" + showTiming + ", screenId=" + screenId + ", bookSeat=" + bookSeat + ", message="
				+ message + "]";
	}
	
}
