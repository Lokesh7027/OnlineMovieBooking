package com.lokesh.bookingplatform.bookingorder.controller.pojo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Getter
@Setter
@ToString
public class BookingOrderResp {

    private Integer resultCode;

    private String message;
}
