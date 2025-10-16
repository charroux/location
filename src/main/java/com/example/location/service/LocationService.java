package com.example.location.service;

import com.example.location.data.Car;
import com.example.location.data.CarRepository;
import com.example.location.web.Dates;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class LocationService {

    CarRepository carRepository;

    public LocationService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Iterable<Car> getVoitures() {
        return carRepository.findAll();
    }

    public Car detail(String immatriculation) throws CarNotFoundException {
        Car car = carRepository.findByPlaque(immatriculation);
        if(car == null) {
            throw new CarNotFoundException(immatriculation);
        }
        return car;
    }

    public void location(String immatriculation, Dates dates) throws CarNotFoundException {
        Car car = this.detail(immatriculation);
        car.setDates(dates);
        car.setLouer(true);
        carRepository.save(car);
    }

    public void ramener(String immatriculation) throws CarNotFoundException {
        Car car = this.detail(immatriculation);
        car.setLouer(false);
        carRepository.save(car);
    }
}
