package com.shah.project.hotel.reservation.service;

import com.shah.project.hotel.reservation.entity.Reservation;
import com.shah.project.hotel.reservation.entity.ReservationEntity;
import com.shah.project.hotel.reservation.mapper.ReservationMapper;
import com.shah.project.hotel.reservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;
    @Autowired
    private ReservationMapper mapper;

    public Reservation getReservation(BigDecimal reservationId) {
        ReservationEntity reservation = reservationId != null ? repository.findById(reservationId.longValue()).orElse(null) : new ReservationEntity();
        return mapper.convertToDomainObj(reservation);
    }

    public Reservation persistReservation(Reservation newReservation) {
        ReservationEntity reservationEntity = mapper.convertToEntityObj(newReservation);
        //reservationEntity.setReservationId();
        reservationEntity = repository.save(reservationEntity);
        return mapper.convertToDomainObj(reservationEntity);
    }
}