package com.lokesh.bookingplatform.bookingorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.lokesh.bookingplatform.bookingorder"})
@ComponentScan(basePackages = {"com.lokesh.bookingplatform.bookingorder"})
public class BookingPlatformBookingOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingPlatformBookingOrderApplication.class, args);
	}

}
