package com.example.exceptionhandler.service;

import com.example.exceptionhandler.constant.ResultMessageCode;
import com.example.exceptionhandler.dto.Car;
import com.example.exceptionhandler.exception.CarNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static com.example.exceptionhandler.constant.ResultMessageCode.IllegalArgument;

@Service
public class CarService {

    private static List<Car> cars = new ArrayList<>();

    @PostConstruct
    public void init(){
        cars.add(new Car("mercedes", "gla"));
        cars.add(new Car("bmw", "i5"));
        cars.add(new Car("audi", "a4"));
    }

    public Object getCarDetails(String brand) throws CarNotFoundException {
            return cars.stream()
                    .filter( car -> car.getBrand().equals(brand) )
                    .findAny()
                    .orElseThrow( ()-> new CarNotFoundException());
    }

}
