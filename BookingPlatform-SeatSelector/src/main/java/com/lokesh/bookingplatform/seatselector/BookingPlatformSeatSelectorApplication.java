package com.lokesh.bookingplatform.seatselector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.lokesh.bookingplatform.seatselector"})
public class BookingPlatformSeatSelectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingPlatformSeatSelectorApplication.class, args);
	}

}
