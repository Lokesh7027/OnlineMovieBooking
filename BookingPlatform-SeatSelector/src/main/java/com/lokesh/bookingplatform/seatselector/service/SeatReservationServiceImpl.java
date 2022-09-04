package com.lokesh.bookingplatform.seatselector.service;


import com.lokesh.bookingplatform.seatselector.controller.pojo.BookingOrderReq;
import com.lokesh.bookingplatform.seatselector.controller.pojo.SeatReservationResp;
import org.springframework.stereotype.Component;

@Component
public class SeatReservationServiceImpl {


    public SeatReservationResp reserveSeat(BookingOrderReq bookingOrderReq) {
        // Here in this method we will call DB to reserve the seat
        SeatReservationResp seatReservationResp = new SeatReservationResp();
        seatReservationResp.setResultCode(0);
        seatReservationResp.setMessage("success");

        return seatReservationResp;


    }

}
