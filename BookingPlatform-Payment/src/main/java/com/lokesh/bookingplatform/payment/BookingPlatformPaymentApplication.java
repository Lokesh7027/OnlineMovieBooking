package com.lokesh.bookingplatform.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lokesh.bookingplatform.payment"})
@EnableDiscoveryClient
public class BookingPlatformPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingPlatformPaymentApplication.class, args);
	}

}
