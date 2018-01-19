package com.demo.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bms.dto.AvailableSeats;
import com.demo.bms.dto.BookingResponse;
import com.demo.bms.service.AvailabilityService;

@RestController
public class AvailabilityController {
	
	@Autowired
	private AvailabilityService availabilityService;
	
	@RequestMapping(value = "/availableSeats/{movieName}/{theatreName}/{showTime}", method = RequestMethod.GET)
	public AvailableSeats checkAvailableSeats(@PathVariable("movieName") String movieName,@PathVariable("theatreName") String theatreName,
			@PathVariable("showTime") String showTime){
		return availabilityService.checkForAvailableSeats(movieName, theatreName, showTime);
	}
	
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String pong(){
		return "Welcome to Bookmyshow";
	}

}
