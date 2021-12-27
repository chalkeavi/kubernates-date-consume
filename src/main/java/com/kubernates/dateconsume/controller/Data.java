package com.kubernates.dateconsume.controller;

import java.util.Date;

public class Data {
	
	private String message;
	private Date date;
	private String environmentInfo;
	private String dateServiceEnvironmentInfo;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEnvironmentInfo() {
		return environmentInfo;
	}
	public void setEnvironmentInfo(String environmentInfo) {
		this.environmentInfo = environmentInfo;
	}
	public String getDateServiceEnvironmentInfo() {
		return dateServiceEnvironmentInfo;
	}
	public void setDateServiceEnvironmentInfo(String dateServiceEnvironmentInfo) {
		this.dateServiceEnvironmentInfo = dateServiceEnvironmentInfo;
	}
	
	public Data() {
		// TODO Auto-generated constructor stub
	}
	public Data(String message, Date date, String environmentInfo, String dateServiceEnvironmentInfo) {
		super();
		this.message = message;
		this.date = date;
		this.environmentInfo = environmentInfo;
		this.dateServiceEnvironmentInfo = dateServiceEnvironmentInfo;
	}
	
	

}
