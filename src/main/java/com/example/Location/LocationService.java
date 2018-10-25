package com.example.Location;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationService {

	private ArrayList<Car> cars = new ArrayList<Car>();

	public LocationService(){
		Car car = new Car("BMW", "AA2111", 2000);
		cars.add(car);
		Car car1 = new Car("Peugeot", "BB33DD", 1000);
		cars.add(car1);
	}
	
	@RequestMapping(value="/cars", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public ArrayList<Car> listCar() {
		return cars;
	}

	@RequestMapping(value="/cars/{plaque}", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public Car car(@PathVariable("plaque") String plateNumber ) {
		for(int i=0; i<cars.size(); i++){
			if(cars.get(i).getPlateNumber().equals(plateNumber)){
				return cars.get(i);
			} 
		}
		return null;
	}

}
