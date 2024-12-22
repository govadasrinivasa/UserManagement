package com.usermanagement.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class ShowDTO {

	private long id;
	private LocalDate showDate;
	private LocalTime showTime;
	private float rateMultiplier;
	private MovieDTO movie;
	private TheaterDTO theatre;
	private Date createdAt;
	private Date updatedAt;
	private MovieDTO movieDto;
	private TheaterDTO theaterDto;
	private List<ShowSeatsDTO> seats;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	public LocalTime getShowTime() {
		return showTime;
	}
	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}
	public float getRateMultiplier() {
		return rateMultiplier;
	}
	public void setRateMultiplier(float rateMultiplier) {
		this.rateMultiplier = rateMultiplier;
	}
	public MovieDTO getMovie() {
		return movie;
	}
	public void setMovie(MovieDTO movie) {
		this.movie = movie;
	}
	public TheaterDTO getTheatre() {
		return theatre;
	}
	public void setTheatre(TheaterDTO theatre) {
		this.theatre = theatre;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public MovieDTO getMovieDto() {
		return movieDto;
	}
	public void setMovieDto(MovieDTO movieDto) {
		this.movieDto = movieDto;
	}
	public TheaterDTO getTheaterDto() {
		return theaterDto;
	}
	public void setTheaterDto(TheaterDTO theaterDto) {
		this.theaterDto = theaterDto;
	}
	public List<ShowSeatsDTO> getSeats() {
		return seats;
	}
	public void setSeats(List<ShowSeatsDTO> seats) {
		this.seats = seats;
	}
	
}