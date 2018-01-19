package com.demo.bms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.bms.dto.BookSeat;
import com.demo.bms.dto.BookingResponse;
import com.demo.bms.dto.RequestBooking;
import com.demo.bms.entity.BookingDetails;
import com.demo.bms.entity.CategoryInfo;
import com.demo.bms.entity.MovieInfo;
import com.demo.bms.entity.RowSeatsBooked;
import com.demo.bms.entity.ScreenRowDetails;
import com.demo.bms.entity.ShowDetails;
import com.demo.bms.entity.ShowScreening;
import com.demo.bms.entity.TheatreInfo;
import com.demo.bms.entity.UserDetails;
import com.demo.bms.repository.BookingRepository;
import com.demo.bms.repository.CategoryRepository;
import com.demo.bms.repository.MovieRepository;
import com.demo.bms.repository.RowSeatsBookedRepository;
import com.demo.bms.repository.ScreenRowDetailsRepository;
import com.demo.bms.repository.ShowDetailsRepository;
import com.demo.bms.repository.ShowScreeningRepository;
import com.demo.bms.repository.TheatreRepository;

@Component
public class BookingServiceImpl implements BookingService{
	
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
	
	@Autowired
	private RowSeatsBookedRepository rowSeatsBookedRepository;
	
	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public BookingResponse doBooking(RequestBooking bookingRequest) {
		
		MovieInfo movie = movieRepository.findByMovieName(bookingRequest.getMovieName());
		TheatreInfo theatreInfo = theatreRepository.findByTheatreName(bookingRequest.getTheatreName());
		ShowDetails showDetails = showDetailsRepository.findByShowTime(bookingRequest.getShowTiming());
		CategoryInfo catInfo = categoryRepository.findByCategoryName(bookingRequest.getCategoryName());
		UserDetails userdets = userDetailsService.getUserInfo(bookingRequest.getUserName());
		ShowScreening showScreening = showScreeningRepository.findByMovieIdAndShowIdAndTheatreId(movie.getMovieId(),showDetails.getShowId(), theatreInfo.getTheatreId());
		
		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setUserId(userdets.getUserId());
		bookingDetails.setNumberOfSeats(bookingRequest.getNoOfSeats());
		bookingDetails.setBookingDate(new Date());
		double amountPaid =( bookingRequest.getNoOfSeats() * catInfo.getPricePerSeat());
		bookingDetails.setAmountPaid(amountPaid);
		bookingDetails.setBookingStatus("ACTIVE");
		BookingDetails bDetails = bookingRepository.save(bookingDetails);
		
		for(BookSeat bookSeat : bookingRequest.getBookSeat()){
			for(Integer i : bookSeat.getSeatNumber()){
				ScreenRowDetails screenRowDetails2 = screenRowDetailsRepository.findBySeatIdAndRowIdAndScreenIdAndShowIdAndTheatreId(i, bookSeat.getRow(),
						showScreening.getScreenId(),showDetails.getShowId(), theatreInfo.getTheatreId());
				screenRowDetails2.setSeatStatus("BLOCKED");
				screenRowDetailsRepository.save(screenRowDetails2);
				RowSeatsBooked rowSeatsBooked = new RowSeatsBooked();
				rowSeatsBooked.setBookingId(bDetails.getBookingId());
				rowSeatsBooked.setRowId(bookSeat.getRow());
				rowSeatsBooked.setScreenId(showScreening.getScreenId());
				rowSeatsBooked.setSeatId(i);
				rowSeatsBooked.setShowId(showDetails.getShowId());
				rowSeatsBooked.setTheatreId(theatreInfo.getTheatreId());
				rowSeatsBookedRepository.save(rowSeatsBooked);
			}
		}
		
		BookingResponse bookingResponse = new BookingResponse();
		bookingResponse.setUserName(userdets.getUserName());
		bookingResponse.setCategoryName(bookingRequest.getCategoryName());
		bookingResponse.setShowTiming(bookingRequest.getShowTiming());
		bookingResponse.setScreenId(showScreening.getScreenId());
		bookingResponse.setBookingId(bDetails.getBookingId());
		bookingResponse.setBookSeat(bookingRequest.getBookSeat());
		bookingResponse.setMovieName(bookingRequest.getMovieName());
		bookingResponse.setTheatreName(bookingRequest.getTheatreName());
		bookingResponse.setMessage("Booking Successful!!");
		bookingResponse.setPricePaid(amountPaid);
		return bookingResponse;
	}

	@Override
	public String cancelBooking(Integer bookingId) {
		BookingDetails bookingDetails = bookingRepository.findByBookingId(bookingId);
		List<RowSeatsBooked> rowSeatsBookedList = rowSeatsBookedRepository.findByBookingId(bookingId);
		for(RowSeatsBooked rowBooked : rowSeatsBookedList){
			List<ScreenRowDetails> screenRowDets = screenRowDetailsRepository.findByRowIdAndScreenIdAndShowIdAndTheatreId(rowBooked.getRowId(), rowBooked.getScreenId(), rowBooked.getShowId(), rowBooked.getTheatreId());
			for(ScreenRowDetails srDetails : screenRowDets){
				srDetails.setSeatStatus("UNBLOCKED");
				screenRowDetailsRepository.save(srDetails);
			}
		}
		bookingDetails.setBookingStatus("CANCELLED");
		bookingRepository.save(bookingDetails);
		
		return "Cancellation for booking id : "+ bookingId +" is Successful";
	}

}
