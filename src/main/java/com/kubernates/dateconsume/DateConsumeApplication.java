package com.kubernates.dateconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.kubernates.dateconsume.controller")
public class DateConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateConsumeApplication.class, args);
	}

}
