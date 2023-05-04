package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> printCars = Arrays.asList(new Car("Lamborghini Aventador", "LP-750"),
            new Car("Vaz", "2109"),
            new Car("Renault Duster", "625"),
            new Car("Mercedes", "E500"),
            new Car("UAZ PATRIOT", "777"));
    @Override
    public List<Car> printCarTable(Integer count) {
        if (count == null || count <= 0 || count > 5) {
            return this.printCars;
        } else {
            return this.printCars.stream().limit(count).toList();
        }
    }
}
