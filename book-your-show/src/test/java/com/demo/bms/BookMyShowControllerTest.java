package com.demo.bms;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.bms.dto.AvailableSeats;
import com.demo.bms.dto.BookSeat;
import com.demo.bms.dto.BookingResponse;
import com.demo.bms.dto.RequestBooking;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = SpringBootApp.class)
@ActiveProfiles("default")
public class BookMyShowControllerTest {
	
	@Autowired
    TestRestTemplate restTemplate;
	
	/**
	 * Required for cancel test case to work. 
	 */
	 @Before
	 public void setUp() {
	        HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        RequestBooking req = new RequestBooking();
	        
	        req.setMovieName("BRAVE");
	        req.setCategoryName("SILVER");
	        req.setUserName("Adam");
	        req.setTheatreName("PVR");
	        req.setShowTiming("10:00 AM");
	        req.setNoOfSeats(2);
	        List<BookSeat> bookSeatLi = new ArrayList<>();
	        BookSeat bookSeat = new BookSeat();
	        bookSeat.setRow("A");
	        List<Integer> li = new ArrayList<>();
	        li.add(1);
	        li.add(2);
	        bookSeat.setSeatNumber(li);
	        bookSeatLi.add(bookSeat);
	        req.setBookSeat(bookSeatLi);
	        
	        HttpEntity<RequestBooking> entity = new HttpEntity<>(req, headers);
	        ResponseEntity<BookingResponse> response = restTemplate.exchange("/buyMovieTickets", HttpMethod.POST, entity, BookingResponse.class);
	        BookingResponse bookingResp = response.getBody();
	        System.out.println("*********");
	        System.out.println(bookingResp);
	        System.out.println("*********");
	        boolean found1 = false;
	        if (bookingResp.getPricePaid() == 300.0) {
	            found1 = true;
	        }
	        assertThat(found1, is(true));
	 }
	
	@Test
    public void testAvailableSeats() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<AvailableSeats> response = restTemplate.exchange("/availableSeats/BRAVE/PVR/10:00 AM", HttpMethod.GET, entity, AvailableSeats.class);
        AvailableSeats availableSeats = response.getBody();
        System.out.println("*********");
        System.out.println(availableSeats);
        System.out.println("*********");
        boolean found1 = false;
        if (availableSeats.getMovieName().equals("BRAVE")) {
            found1 = true;
        }
        assertThat(found1, is(true));
    }
	
	@Test
    public void testBookingTicket() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RequestBooking req = new RequestBooking();
        
        req.setMovieName("BRAVE");
        req.setCategoryName("SILVER");
        req.setUserName("Adam");
        req.setTheatreName("PVR");
        req.setShowTiming("10:00 AM");
        req.setNoOfSeats(2);
        List<BookSeat> bookSeatLi = new ArrayList<>();
        BookSeat bookSeat = new BookSeat();
        bookSeat.setRow("A");
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        bookSeat.setSeatNumber(li);
        bookSeatLi.add(bookSeat);
        req.setBookSeat(bookSeatLi);
        
        HttpEntity<RequestBooking> entity = new HttpEntity<>(req, headers);
        ResponseEntity<BookingResponse> response = restTemplate.exchange("/buyMovieTickets", HttpMethod.POST, entity, BookingResponse.class);
        BookingResponse bookingResp = response.getBody();
        System.out.println("*********");
        System.out.println(bookingResp);
        System.out.println("*********");
        boolean found1 = false;
        if (bookingResp.getPricePaid() == 300.0) {
            found1 = true;
        }
        assertThat(found1, is(true));
    }
	
	
	@Test
    public void testCancelTicket() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange("/cancelMovieTickets/1000", HttpMethod.GET, entity, String.class);
        String respString = response.getBody();
        System.out.println("*********");
        System.out.println(respString);
        System.out.println("*********");
        boolean found1 = false;
        if (null != respString) {
            found1 = true;
        }
        assertThat(found1, is(true));
    
    }

}
