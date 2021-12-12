package com.vikas.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikas.flightReservation.entites.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
