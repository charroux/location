package com.example.Location;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationService {
	
	@RequestMapping(value="/", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public String disBonjour() {
		return "bonjour";
	}
	
	@RequestMapping(value="/car", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public Car carInfo() {
		Car car = new Car("Peugeot", "11AA22", 1000);
		return car;
	}

}
