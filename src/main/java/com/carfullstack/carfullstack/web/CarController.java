package com.carfullstack.carfullstack.web;


import com.carfullstack.carfullstack.domain.Car;
import com.carfullstack.carfullstack.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarRepository repository;

    @GetMapping("/cars")
    public Iterable<Car> getCars() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable Long id) {
        Iterable<Car> carList = getCars();
        for(Car c: carList) {
            if(c.getId() == id) {
                repository.delete(c);
            }
        }
    }

    @PostMapping("/post")
    public void addCar(@RequestBody Car car) {
        repository.save(car);
    }

}
