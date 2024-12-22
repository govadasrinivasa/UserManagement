package com.usermanagement.dto;

import java.util.List;

import com.usermanagement.enums.TheaterType;

public class TheaterDTO {

	private long id;
	private String name;
	private TheaterType type;
	private String city;
	private String address;
	private List<ShowDTO> shows;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TheaterType getType() {
		return type;
	}
	public void setType(TheaterType type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<ShowDTO> getShows() {
		return shows;
	}
	public void setShows(List<ShowDTO> shows) {
		this.shows = shows;
	}
	
}