package com.vikas.flightReservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.flightReservation.dto.ReservationRequest;
import com.vikas.flightReservation.entites.Flight;
import com.vikas.flightReservation.entites.Passenger;
import com.vikas.flightReservation.entites.Reservation;
import com.vikas.flightReservation.repos.FlightRepository;
import com.vikas.flightReservation.repos.PassengerRepository;
import com.vikas.flightReservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
	
		
		Long flightId = request.getFlightId();
		
	
		Flight flight = flightRepository.findById(flightId).orElse(null);
		
		Passenger passenger=new Passenger();
		passenger.setFirstName(request.getpFirstName());
		passenger.setLastName(request.getpLastName());
		passenger.setMiddleName(request.getpMiddleName());
		passenger.setEmail(request.getpEmail());
		passenger.setPhone(request.getpPhone());
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		Reservation reservation=new Reservation();
		reservation.setFlight(flight);
		reservation.setCheckedIn(false);
		reservation.setPassenger(savedPassenger);
		
		Reservation savedReservation = reservationRepository.save(reservation);
		
		return savedReservation;
		
	}

}
