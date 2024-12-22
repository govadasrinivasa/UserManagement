package com.usermanagement.dto;

import java.util.List;

public class UserManagementDTO {

	private long id;
	private String name;
	private String mobile;
	
	private List<TicketDTO> tickets;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public List<TicketDTO> getTickets() {
		return tickets;
	}
	public void setTickets(List<TicketDTO> tickets) {
		this.tickets = tickets;
	}
	
}
