package com.shah.project.hotel.reservation.service;

import com.shah.project.hotel.reservation.entity.ReservationEntity;
import com.shah.project.hotel.reservation.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationEntity entity;
    @Autowired
    private ReservationMapper mapper;


}