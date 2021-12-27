package com.kubernates.dateconsume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private DateServiceProxy proxy;


	@Autowired
	private InstanceVariable var;
	
	@GetMapping("/")
	public String getHealth() {
		return "{healthy:true}";
	}

	@GetMapping("/date-consume/message/{name}")
	public String getMessage(@PathVariable("name") String name) {
		return "Welcome " + name;
	}

	@GetMapping("/date-consume/message")
	public Data getDate() {
		Data data = proxy.getData();
		
		return new Data("Welcome",data.getDate(),var.retrieveInstance(),data.getDateServiceEnvironmentInfo());
	}

}
