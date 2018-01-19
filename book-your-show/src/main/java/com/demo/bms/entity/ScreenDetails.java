package com.demo.bms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCREEN_DETAILS")
public class ScreenDetails {
	
	@Id
	@Column(name= "SCREEN_ID")
	private Integer screenId;
	
	@Column(name= "TOTAL_SEAT_COUNT")
	private int totalSeatCount;

}
