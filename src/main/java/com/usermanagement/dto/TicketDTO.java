package com.usermanagement.dto;

import java.util.Date;

public class TicketDTO {

	private long id;
	private String allottedSeats;
	private double amount;
	private Date bookedAt;
	private ShowDTO show;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAllottedSeats() {
		return allottedSeats;
	}
	public void setAllottedSeats(String allottedSeats) {
		this.allottedSeats = allottedSeats;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getBookedAt() {
		return bookedAt;
	}
	public void setBookedAt(Date bookedAt) {
		this.bookedAt = bookedAt;
	}
	public ShowDTO getShow() {
		return show;
	}
	public void setShow(ShowDTO show) {
		this.show = show;
	}
	
}