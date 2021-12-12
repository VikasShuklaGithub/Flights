package com.vikas.flightReservation.dto;

public class ReservationRequest {
	
	public Long flightId;
	public String pFirstName;
	public String pMiddleName;
	public String pLastName;
	public String pEmail;
	public String pPhone;
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getpFirstName() {
		return pFirstName;
	}
	public void setpFirstName(String pFirstName) {
		this.pFirstName = pFirstName;
	}
	public String getpMiddleName() {
		return pMiddleName;
	}
	public void setpMiddleName(String pMiddleName) {
		this.pMiddleName = pMiddleName;
	}
	public String getpLastName() {
		return pLastName;
	}
	public void setpLastName(String pLastName) {
		this.pLastName = pLastName;
	}
	public String getpPhone() {
		return pPhone;
	}
	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	
	

}
