package com.shah.project.hotel.reservation.model;


import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class DTOReservation {
    @Id
    @Column
    private BigDecimal reservationId;
    private String customerId;
    private String customerEmail;
    private String cardNumber;
    private OffsetDateTime reservationBookingDate;
    private OffsetDateTime reservationArriveDate;
    private OffsetDateTime reservationDepartDate;
    private String hotelId;

}
