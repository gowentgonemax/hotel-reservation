package com.shah.project.hotel.reservation.repository;


import com.shah.project.hotel.reservation.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class ReservationRepository implements CrudRepository<ReservationEntity, Long> {
    @Override
    public <S extends ReservationEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ReservationEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ReservationEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ReservationEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<ReservationEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ReservationEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ReservationEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
