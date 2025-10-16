package com.example.location;

import com.example.location.data.Car;
import com.example.location.data.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository carRepository) {
		return (args) -> {
			Car car = new Car();
			car.setPlaque("AA11BB");
			carRepository.save(car);

			car = new Car();
			car.setPlaque("BB22CC");
			carRepository.save(car);

		};
	};

}
