package com.demo.bms.dto;

public class AvailabilityInfo {

    private String date;
    private String categrory;
    private Double price;
    private String row;
    private Integer seatNumber;
    private String status;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategrory() {
        return categrory;
    }

    public void setCategrory(String categrory) {
        this.categrory = categrory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public Integer getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AvailabilityInfo [date=" + date + ", categrory=" + categrory + ", price=" + price + ", row=" + row
				+ ", seatNumber=" + seatNumber + ", status=" + status + "]";
	}
}
