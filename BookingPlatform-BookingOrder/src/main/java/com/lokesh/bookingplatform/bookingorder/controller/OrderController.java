package com.lokesh.bookingplatform.bookingorder.controller;


import com.lokesh.bookingplatform.bookingorder.controller.pojo.BookingOrderReq;
import com.lokesh.bookingplatform.bookingorder.controller.pojo.BookingOrderResp;
import com.lokesh.bookingplatform.bookingorder.controller.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping("/v1/show")
    BookingOrderResp performOrder(BookingOrderReq bookingOrderReq,BookingOrderResp bookingOrderResp){

        return this.orderService.performBooking(bookingOrderReq);

    }


}
