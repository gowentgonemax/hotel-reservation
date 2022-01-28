package com.shah.project.hotel.reservation.mapper;
import com.shah.project.hotel.reservation.model.DTOReservation;
import com.shah.project.hotel.reservation.model.Reservation;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {


    public Reservation mappingToReservation(DTOReservation dto){

        Reservation reservation =  new Reservation();
        reservation.setReservationId(dto.getReservationId());
        reservation.setReservationArriveDate(dto.getReservationArriveDate());
        reservation.setReservationDepartDate(dto.getReservationDepartDate());
        reservation.setCardNumber("");
        reservation.setCustomerEmail(dto.getCustomerEmail());
        reservation.setCustomerId(dto.getCustomerId());

        return reservation;

    }
}
