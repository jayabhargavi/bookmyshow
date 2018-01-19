package com.demo.bms.service;

import com.demo.bms.dto.AvailableSeats;

public interface AvailabilityService {
	
	AvailableSeats checkForAvailableSeats(String movieName, String theatreName,String showTiming);

}
