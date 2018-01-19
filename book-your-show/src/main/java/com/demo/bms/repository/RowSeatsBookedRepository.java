package com.demo.bms.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.RowSeatsBooked;

@Repository
public interface RowSeatsBookedRepository extends JpaRepository<RowSeatsBooked, Serializable>{

	List<RowSeatsBooked> findByBookingId(Integer bookingId);

}
