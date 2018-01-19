package com.demo.bms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.ShowScreening;

@Repository
public interface ShowScreeningRepository extends JpaRepository<ShowScreening, Serializable>{

	ShowScreening findByMovieIdAndShowIdAndTheatreId(Integer movieId, Integer showId, Integer theatreId);

}
