package service;

import model.Car;

import java.util.Arrays;
import java.util.List;

public interface CarService {
    static List<Car> printCarTable(Integer count) {
        List<Car> printCars = Arrays.asList(new Car("Lamborghini Aventador", "LP-750"),
                new Car("Vaz", "2109"),
                new Car("Renault Duster", "625"),
                new Car("Mercedes", "E500"),
                new Car("UAZ PATRIOT", "777"));
        if (count == null || count <= 0 || count > 5) {
            return printCars;
        } else {
            return printCars.stream().limit(count).toList();
        }
    }
}
