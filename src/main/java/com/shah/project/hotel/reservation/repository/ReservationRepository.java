package com.shah.project.hotel.reservation.repository;


import com.shah.project.hotel.reservation.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {

     Optional<ReservationEntity> findById(Long reservationId);

//     Iterable<ReservationEntity> findAll();
//
//     Optional<ReservationEntity> findByCustomerId(String CustomerId);
}
