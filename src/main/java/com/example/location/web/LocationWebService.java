package com.example.location.web;

import com.example.location.data.Car;
import com.example.location.data.CarRepository;
import com.example.location.service.CarNotFoundException;
import com.example.location.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationWebService {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CarNotFoundException.class)
    public void handleException1() { }

    Logger logger = LoggerFactory.getLogger(LocationWebService.class);
    LocationService locationService;

    public LocationWebService(LocationService locationService){
        this.locationService = locationService;
    }

    @GetMapping("/cars/{plaque}")
    @ResponseBody
    public Car getDetail(@PathVariable("plaque") String immatriculation) throws CarNotFoundException {
        logger.info("Plaque: " + immatriculation);
        return locationService.detail(immatriculation);
    }

    @PutMapping("/cars/{plaque}")
    public void louer(@PathVariable("plaque") String immatriculation,
                         @RequestParam("rent") boolean rent,
                         @RequestBody Dates dates
    ) throws CarNotFoundException {
        //System.out.println();
        logger.info("Plaque: " + immatriculation);
        logger.info("rent: " + rent);
        logger.info("dates: " + dates);
        if(rent == true) {
            locationService.location(immatriculation, dates);
        } else {
            locationService.ramener(immatriculation);
        }
    }

}
