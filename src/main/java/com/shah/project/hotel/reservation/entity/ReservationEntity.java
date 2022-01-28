package com.shah.project.hotel.reservation.entity;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "RESERVATION")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ReservationEntity {
    @Id
    @Column(name = "RESERVATION_ID")
    private BigDecimal reservationId;
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Column(name = "CUSTOMER_EMAIL")
    private String customerEmail;
    @Column(name = "CUSTOMER_CARD_NUMBER")
    private String cardNumber;
    @Column(name = "RES_BOOKING_DT")
    private Timestamp reservationBookingDate;
    @Column(name = "RES_ARRIVE_DT")
    private Timestamp reservationArriveDate;
    @Column(name = "RES_DEPART_DT")
    private Timestamp reservationDepartDate;
    @Column(name = "HOTEL_ID")
    private String hotelId;
    @Column(name = "ROOM_TYPE")
    private String roomType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReservationEntity that = (ReservationEntity) o;
        return reservationId != null && Objects.equals(reservationId, that.reservationId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
