package com.demo.bms.service;

import com.demo.bms.dto.BookingResponse;
import com.demo.bms.dto.RequestBooking;
/**
 * This interface provides the methods possible for booking and canceling tickets 
 *
 */
public interface BookingService {
	
	public BookingResponse doBooking(RequestBooking bookingRequest);
	
	public String cancelBooking(Integer bookingId); 
	

}
