package com.usermanagement.dto;

import java.util.Set;

import com.usermanagement.enums.SeatType;

public class BookTicketRequestDto {

	private Set<String> seatsNumbers;
	private long userId;
	private long showId;
	private SeatType seatType;
	
	public Set<String> getSeatsNumbers() {
		return seatsNumbers;
	}
	public void setSeatsNumbers(Set<String> seatsNumbers) {
		this.seatsNumbers = seatsNumbers;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getShowId() {
		return showId;
	}
	public void setShowId(long showId) {
		this.showId = showId;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	
}