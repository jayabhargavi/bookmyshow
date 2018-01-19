package com.demo.bms.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.ScreenRowDetails;

@Repository
public interface ScreenRowDetailsRepository extends JpaRepository<ScreenRowDetails, Serializable>{

	ScreenRowDetails findBySeatIdAndRowIdAndScreenIdAndShowIdAndTheatreId(Integer seatId, String row, Integer j, Integer showId,
			Integer theatreId);

	List<ScreenRowDetails> findByRowIdAndScreenIdAndShowIdAndTheatreId(String rowId, Integer screenId, Integer showId,
			Integer theatreId);

	List<ScreenRowDetails> findByScreenIdAndShowIdAndTheatreId(Integer screenId, Integer showId, Integer theatreId);

}
