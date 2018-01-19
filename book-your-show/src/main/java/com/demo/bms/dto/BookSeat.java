
package com.demo.bms.dto;

import java.util.List;

public class BookSeat {

    private String row;
    private List<Integer> seatNumber = null;

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public List<Integer> getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(List<Integer> seatNumber) {
        this.seatNumber = seatNumber;
    }

	@Override
	public String toString() {
		return "BookSeat [row=" + row + ", seatNumber=" + seatNumber + "]";
	}

}
