package com.vikas.flightReservation.service;



import com.vikas.flightReservation.dto.ReservationRequest;
import com.vikas.flightReservation.entites.Reservation;


public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);

}
