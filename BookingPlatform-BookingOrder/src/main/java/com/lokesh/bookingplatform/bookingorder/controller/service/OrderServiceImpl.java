package com.lokesh.bookingplatform.bookingorder.controller.service;

import com.lokesh.bookingplatform.bookingorder.client.PaymentClient;
import com.lokesh.bookingplatform.bookingorder.client.SeatSelectorClient;
import com.lokesh.bookingplatform.bookingorder.controller.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class OrderServiceImpl {

    @Autowired
    private SeatSelectorClient selectorClient;

    @Autowired
    private PaymentClient paymentClient;


    public BookingOrderResp performBooking(BookingOrderReq bookingOrderReq) {

        BookingOrderResp bookingOrderResp = new BookingOrderResp();

        SeatReservationResp seatReservationResp = selectorClient.seatReservation(bookingOrderReq);

        if(null != seatReservationResp && 0 == seatReservationResp.getResultCode()) {
            PaymentReq paymentReq = new PaymentReq();
            paymentReq.setOrderId("12233333");
            paymentReq.setAmout(100.0);
            PaymentResp paymentResp = paymentClient.performPayment(paymentReq);
            if(null != paymentResp && 0 == paymentResp.getResultCode()) {
                bookingOrderResp.setResultCode(0);
                bookingOrderResp.setMessage("Booking Successful");
            }
        } else  {
            bookingOrderResp.setResultCode(1);
            bookingOrderResp.setMessage("Booking not success because seats are not available");
        }

        // perform Post Booking Resp
        handleBookingResp(bookingOrderReq,bookingOrderResp);


    return bookingOrderResp;
    }

    /**
     * Method to handle task async way after booking completed
     */
    private void handleBookingResp(BookingOrderReq bookingOrderReq, BookingOrderResp bookingOrderResp){

    }

}
