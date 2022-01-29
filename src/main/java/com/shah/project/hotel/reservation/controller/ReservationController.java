package com.shah.project.hotel.reservation.controller;

import com.shah.project.hotel.reservation.api.HotelMgtReservationApi;
import com.shah.project.hotel.reservation.entity.Reservation;
import com.shah.project.hotel.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ReservationController implements HotelMgtReservationApi {
    @Autowired
    private ReservationService service;

    @Override
    public ResponseEntity<Reservation> createReservation(@RequestBody final Reservation reservationRequest) {
        return ResponseEntity.ok(service.persistReservation(reservationRequest));
    }

    @Override
    public ResponseEntity<Reservation> getReservation(@PathVariable("reservationId") final BigDecimal reservationId) {
        Reservation reservation = service.getReservation(reservationId);
        return ResponseEntity.ok(reservation);
    }
}
