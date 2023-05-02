package service;

import model.Car;

import java.util.List;
import java.util.stream.Stream;

public class CarServiceImpl implements CarService {
    private Car car1 = new Car("Lamborghini Aventador", "LP-750");
    private Car car2 = new Car("Vaz", "2109");
    private Car car3 = new Car("Renault Duster", "625");
    private Car car4 = new Car("Mercedes", "E500");
    private Car car5 = new Car("UAZ PATRIOT", "777");

    @Override
    public List<Car> printCarTable(int count) {
        return Stream.of(car1, car2, car3, car4, car5).limit(count).toList();
    }

}
