package com.example.location.web;

import com.example.location.data.Car;
import com.example.location.data.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationWebService {

    CarRepository carRepository;

    public LocationWebService(CarRepository carRepository){
        this.carRepository = carRepository;
        Car ferrari = new Car();
        ferrari.setPlaque("11AA22");
        carRepository.save(ferrari);
    }

    Logger logger = LoggerFactory.getLogger(LocationWebService.class);

    @GetMapping("/bonjour")
    public String disBonjour() {
        return "Bonjour";
    }

    @GetMapping("/cars/{plaque}")
    @ResponseBody
    public Car getDetail(@PathVariable("plaque") String immatriculation){
        logger.info("Plaque: " + immatriculation);
        Car car = new Car();
        car.setPlaque("AZZER");
        return car;
    }

    @PutMapping("/cars/{plaque}")
    public void louer(@PathVariable("plaque") String immatriculation,
                         @RequestParam("rent") boolean rent,
                         @RequestBody Dates dates
    ){
        //System.out.println();
        logger.info("Plaque: " + immatriculation);
        logger.info("rent: " + rent);
        logger.info("dates: " + dates);
    }

}
