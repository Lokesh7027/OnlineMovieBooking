package com.lokesh.bookingplatform.browsemovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.lokesh.bookingplatform"})
public class BookingPlatformBrowseMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingPlatformBrowseMovieApplication.class, args);
	}

}
