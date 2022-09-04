package com.lokesh.bookingplatform.bookingorder.controller.pojo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentReq {

    private String orderId;

    private Double amout;

}
