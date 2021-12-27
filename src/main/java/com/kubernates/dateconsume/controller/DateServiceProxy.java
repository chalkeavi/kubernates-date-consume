package com.kubernates.dateconsume.controller;

import java.util.Date;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "date-service1",url = "${DATE_SERVICE_URI:http://localhost}:8000")
public interface DateServiceProxy {
	
	@GetMapping("/date-service1/date")
	public Data getData();

}
