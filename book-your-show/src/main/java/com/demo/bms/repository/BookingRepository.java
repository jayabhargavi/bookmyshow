package com.demo.bms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.BookingDetails;

@Repository
public interface BookingRepository extends JpaRepository<BookingDetails, Serializable>{

	BookingDetails findByBookingId(Integer bookingId);

}
