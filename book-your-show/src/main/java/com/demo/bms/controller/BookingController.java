package com.demo.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bms.dto.BookingResponse;
import com.demo.bms.dto.RequestBooking;
import com.demo.bms.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@RequestMapping(value= "/buyMovieTickets", method = RequestMethod.POST)
	public BookingResponse doBooking(@RequestBody RequestBooking bookingRequest){
		return bookingService.doBooking(bookingRequest);
	}
	
	@RequestMapping(value = "/cancelMovieTickets/{bookingId}", method = RequestMethod.GET)
	public String cancelBooking(@PathVariable("bookingId") String bookingId){
		return bookingService.cancelBooking(Integer.valueOf(bookingId));
	}

}
