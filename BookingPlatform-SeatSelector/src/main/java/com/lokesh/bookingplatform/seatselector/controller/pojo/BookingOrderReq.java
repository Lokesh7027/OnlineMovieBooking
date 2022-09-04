package com.lokesh.bookingplatform.seatselector.controller.pojo;


import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Getter
@Setter
@Validated
public class BookingOrderReq {

    private String showId;

    private List<String> seatIds;


}
