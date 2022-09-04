package com.lokesh.bookingplatform.bookingorder.client;


import com.lokesh.bookingplatform.bookingorder.controller.pojo.BookingOrderReq;
import com.lokesh.bookingplatform.bookingorder.controller.pojo.SeatReservationResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "BookingPlatform-SeatSelector")
public interface SeatSelectorClient {


    @RequestMapping(value = "/seatselector/v1/blockseats",method = RequestMethod.POST)
    SeatReservationResp seatReservation(BookingOrderReq bookingOrderReq);
}
