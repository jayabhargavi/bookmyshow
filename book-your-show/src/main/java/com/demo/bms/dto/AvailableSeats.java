
package com.demo.bms.dto;

import java.util.List;

public class AvailableSeats {

    private String movieName;
    private String theatreName;
    private String showTime;
    private List<AvailabilityInfo> availabilityInfo = null;

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

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public List<AvailabilityInfo> getAvailabilityInfo() {
        return availabilityInfo;
    }

    public void setAvailabilityInfo(List<AvailabilityInfo> availabilityInfo) {
        this.availabilityInfo = availabilityInfo;
    }

	@Override
	public String toString() {
		return "AvailableSeats [movieName=" + movieName + ", theatreName=" + theatreName + ", showTime=" + showTime
				+ ", availabilityInfo=" + availabilityInfo + "]";
	}
    
}
