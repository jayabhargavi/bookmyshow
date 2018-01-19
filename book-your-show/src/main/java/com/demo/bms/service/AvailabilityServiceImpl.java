package com.demo.bms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bms.dto.AvailabilityInfo;
import com.demo.bms.dto.AvailableSeats;
import com.demo.bms.entity.CategoryInfo;
import com.demo.bms.entity.MovieInfo;
import com.demo.bms.entity.ScreenRowDetails;
import com.demo.bms.entity.ShowDetails;
import com.demo.bms.entity.ShowScreening;
import com.demo.bms.entity.TheatreInfo;
import com.demo.bms.repository.CategoryRepository;
import com.demo.bms.repository.MovieRepository;
import com.demo.bms.repository.ScreenRowDetailsRepository;
import com.demo.bms.repository.ShowDetailsRepository;
import com.demo.bms.repository.ShowScreeningRepository;
import com.demo.bms.repository.TheatreRepository;
import com.demo.bms.util.CommonUtility;

@Service
public class AvailabilityServiceImpl implements AvailabilityService {
	
	@Autowired
	private UserService userDetailsService;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private TheatreRepository theatreRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ShowDetailsRepository showDetailsRepository;
	
	@Autowired
	private ShowScreeningRepository showScreeningRepository;
	
	@Autowired
	private ScreenRowDetailsRepository screenRowDetailsRepository;

	@Override
	public AvailableSeats checkForAvailableSeats(String movieName, String theatreName, String showTiming) {
		AvailableSeats availableSeats = new AvailableSeats();
		List<AvailabilityInfo> availableList = new ArrayList<>();
		
		MovieInfo movie = movieRepository.findByMovieName(movieName);
		TheatreInfo theatreInfo = theatreRepository.findByTheatreName(theatreName);
		ShowDetails showDetails = showDetailsRepository.findByShowTime(showTiming);
		ShowScreening showScreen = showScreeningRepository.findByMovieIdAndShowIdAndTheatreId(movie.getMovieId(), showDetails.getShowId(), theatreInfo.getTheatreId()); 
		List<ScreenRowDetails> screenRowDetails = screenRowDetailsRepository.findByScreenIdAndShowIdAndTheatreId(showScreen.getScreenId(), showDetails.getShowId(),  theatreInfo.getTheatreId());
		
		availableSeats.setMovieName(movieName);
		availableSeats.setTheatreName(theatreName);
		availableSeats.setShowTime(showTiming);
		for(ScreenRowDetails screenRow : screenRowDetails){
			AvailabilityInfo availabilityInfo = new AvailabilityInfo();
			availabilityInfo.setDate(CommonUtility.datetoString(screenRow.getDate()));
			CategoryInfo catInfo = categoryRepository.findByCategoryId(screenRow.getCategoryId());
			availabilityInfo.setCategrory(catInfo.getCategoryName());
			availabilityInfo.setPrice(catInfo.getPricePerSeat());
			availabilityInfo.setRow(screenRow.getRowId());
			availabilityInfo.setSeatNumber(screenRow.getSeatId());
			availabilityInfo.setStatus(screenRow.getSeatStatus());
			availableList.add(availabilityInfo);
		}
		availableSeats.setAvailabilityInfo(availableList);
		return availableSeats;
	}
	

}
