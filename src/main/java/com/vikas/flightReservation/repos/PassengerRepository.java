package com.vikas.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikas.flightReservation.entites.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
