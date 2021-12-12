package com.vikas.flightReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vikas.flightReservation.dto.ReservationRequest;
import com.vikas.flightReservation.entites.Flight;
import com.vikas.flightReservation.entites.Reservation;
import com.vikas.flightReservation.repos.FlightRepository;
import com.vikas.flightReservation.repos.ReservationRepository;
import com.vikas.flightReservation.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	ReservationService reservationService;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId")Long flightId,ModelMap modelMap) {
		
		
		Flight flight = flightRepository.findById(flightId).orElse(null);
		modelMap.addAttribute("flight", flight);
		return "showCompleteReservation";
	}
	
	@RequestMapping(value="/completeReservation",method=RequestMethod.POST)
	public String completeResrvation(ReservationRequest request,ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation Created Successfully and the ID is : "+reservation.getId());
		return "reservationConfirmation";
		
	}
	
}
