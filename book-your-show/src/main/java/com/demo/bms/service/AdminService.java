package com.demo.bms.service;

import com.demo.bms.entity.MovieInfo;
import com.demo.bms.entity.TheatreInfo;

/**
 * This class gives the operations that has to be performed by an Admin
 *
 */

public interface AdminService {
	
	MovieInfo addMovie(MovieInfo movie);
	
	TheatreInfo addTheatre(TheatreInfo theatre);
	
	MovieInfo removeMovie(MovieInfo movie);
	
	TheatreInfo removeTheatre(TheatreInfo theatre);

}
