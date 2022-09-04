package com.lokesh.bookingplatform.bookingorder.client;


import com.lokesh.bookingplatform.bookingorder.controller.pojo.BookingOrderReq;
import com.lokesh.bookingplatform.bookingorder.controller.pojo.PaymentReq;
import com.lokesh.bookingplatform.bookingorder.controller.pojo.PaymentResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "BookingPlatform-Payment")
public interface PaymentClient {


    @RequestMapping(value = "/payment/v1/performpayment",method = RequestMethod.POST)
    PaymentResp performPayment(PaymentReq paymentReq);



}
