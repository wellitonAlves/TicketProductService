package com.ticket.app.product.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateProductRequestModel {
	
	@NotNull(message="EventName cannot be null")
	@Size(min=2, max=16,message="EventName must be equal or grater than 8 characters and less then 16 characters")
	private String eventName;
	
	@NotNull(message="place cannot be null")
	private String place;
	
	@Email @NotNull(message="price cannot be null") 
	private String price;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
