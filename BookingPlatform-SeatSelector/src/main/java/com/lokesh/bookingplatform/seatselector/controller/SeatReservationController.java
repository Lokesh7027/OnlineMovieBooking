package com.lokesh.bookingplatform.seatselector.controller;


import com.lokesh.bookingplatform.seatselector.controller.pojo.BookingOrderReq;
import com.lokesh.bookingplatform.seatselector.controller.pojo.SeatReservationResp;
import com.lokesh.bookingplatform.seatselector.service.SeatReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/seatselector")
public class SeatReservationController {

    @Autowired
    SeatReservationServiceImpl seatReservationService;


    @RequestMapping(value = "/v1/blockseats",method = RequestMethod.POST)
    SeatReservationResp reserveSeat(@Validated BookingOrderReq bookingOrderReq) {
        return this.seatReservationService.reserveSeat(bookingOrderReq);
    }
}
