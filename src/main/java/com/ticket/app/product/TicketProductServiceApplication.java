package com.ticket.app.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TicketProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketProductServiceApplication.class, args);
	}

}
