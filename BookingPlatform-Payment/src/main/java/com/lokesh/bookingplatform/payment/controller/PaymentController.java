package com.lokesh.bookingplatform.payment.controller;


import com.lokesh.bookingplatform.payment.controller.pojo.PaymentReq;
import com.lokesh.bookingplatform.payment.controller.pojo.PaymentResp;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/payment")
public class PaymentController {

 @RequestMapping(value = "/v1/performpayment",method = RequestMethod.POST)
 PaymentResp peformPayment(PaymentReq paymentReq) {

     // perform payment through different payment gateway

     PaymentResp paymentResp = new PaymentResp();
     paymentResp.setResultCode(0);
     paymentResp.setMessage("success");

     return paymentResp;


 }

}
