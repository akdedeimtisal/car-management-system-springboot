package com.carfullstack.carfullstack;

import com.carfullstack.carfullstack.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CarfullstackApplication implements CommandLineRunner {
/*	private static final Logger =

			LoggerFactory.getLogger(CarfullstackApplication.class);
*/
	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository orepository;

	@Autowired
	private UserRepository urepository;

	public static void main(String[] args) {
		SpringApplication.run(CarfullstackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner("John", "Johnson");
		Owner owner2 = new Owner("Mary", "Sheldon");
		orepository.saveAll(Arrays.asList(owner1, owner2));


		repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000, owner1));
		repository.save(new Car("Audi", "A5", "Gray", "ADF-1122", 2020, 69000, owner2));
		repository.save(new Car("Opel", "Astra", "Black", "ADF-1123", 2022, 79000, owner1));
		repository.save(new Car("Volkswagen", "Polo", "White", "ADF-1124", 2019, 49000, owner1));

/*		urepository.save(new User("user", "$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue", "USER"));
		urepository.save(new User("admin", "$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW", "ADMIN"));*/


	}
}
