package com.shah.project.hotel.reservation.mapper;

import com.shah.project.hotel.reservation.entity.Reservation;
import com.shah.project.hotel.reservation.entity.ReservationEntity;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

@Component
public class ReservationMapper {


    public ReservationEntity convertToEntityObj(Reservation domainObj) {
        ReservationEntity entityObj = new ReservationEntity();
        if (domainObj != null) {
            if (domainObj.getReservationId() != null) {
                entityObj.setReservationId(domainObj.getReservationId());
            }
            entityObj.setHotelId(domainObj.getHotelId());
            if (domainObj.getReservationArriveDate() != null)
                entityObj.setReservationArriveDate(Timestamp.valueOf(domainObj.getReservationArriveDate().atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime()));
            if (domainObj.getReservationDepartDate() != null) {
                entityObj.setReservationDepartDate(Timestamp.valueOf(domainObj.getReservationDepartDate().atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime()));
            }
            if (domainObj.getReservationBookingDate() != null) {
                entityObj.setReservationBookingDate(Timestamp.valueOf(domainObj.getReservationBookingDate().atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime()));
            }
            entityObj.setCardNumber(domainObj.getCardNumber());
            entityObj.setCustomerEmail(domainObj.getCustomerEmail());
            entityObj.setCustomerId(domainObj.getCustomerId());
            if (domainObj.getRoomType() != null) {
                entityObj.setRoomType(domainObj.getRoomType().toString());
            }
        }
        return entityObj;
    }

    public Reservation convertToDomainObj(ReservationEntity entityObj) {
        Reservation domainObj = new Reservation();
        if (entityObj != null) {
            if (entityObj.getReservationId() != null) {
                domainObj.setReservationId(domainObj.getReservationId());
            }
            entityObj.setHotelId(entityObj.getHotelId());
            if (entityObj.getReservationArriveDate() != null)
                domainObj.setReservationArriveDate(OffsetDateTime.ofInstant(Instant.ofEpochMilli(entityObj.getReservationArriveDate().getTime()), ZoneId.of("UTC")));
            if (entityObj.getReservationDepartDate() != null) {
                domainObj.setReservationDepartDate(OffsetDateTime.ofInstant(Instant.ofEpochMilli(entityObj.getReservationDepartDate().getTime()), ZoneId.of("UTC")));
            }
            if (entityObj.getReservationBookingDate() != null) {
                domainObj.setReservationBookingDate(OffsetDateTime.ofInstant(Instant.ofEpochMilli(entityObj.getReservationBookingDate().getTime()), ZoneId.of("UTC")));
            }
            domainObj.setCardNumber(entityObj.getCardNumber());
            domainObj.setCustomerEmail(entityObj.getCustomerEmail());
            domainObj.setCustomerId(entityObj.getCustomerId());
            if (domainObj.getRoomType() != null) {
                domainObj.setRoomType(Reservation.RoomTypeEnum.valueOf(entityObj.getRoomType()));
            }
        }
        return domainObj;
    }
}
