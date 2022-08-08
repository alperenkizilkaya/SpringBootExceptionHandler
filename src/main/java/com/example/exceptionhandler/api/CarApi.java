package com.example.exceptionhandler.api;

import com.example.exceptionhandler.dto.Car;
import com.example.exceptionhandler.exception.CarNotFoundException;
import com.example.exceptionhandler.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarApi {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<Object> getCarDetails(String brand) throws CarNotFoundException {
        if(brand.startsWith("1"))
            throw new IllegalArgumentException();
        return ResponseEntity.ok(carService.getCarDetails(brand));
    }
}
