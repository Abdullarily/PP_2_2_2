package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public List<String> getCars(List<Car> cars, int count) {
        List<Car> carsOut = new ArrayList<>();
        if (count >= cars.size()) {
            carsOut = cars;
        } else {
            for (int i = 0; i < count; i++) {
                carsOut.add(cars.get(i));
            }
        }
        List <String> carsToString = new ArrayList<>();
        for (Car car : carsOut) {
            carsToString.add(car.toString());
        }
        return carsToString;
    }
    public List<Car> listOfFiveCars() {
        Car car1 = new Car("BMW", "yellow", 2015);
        Car car2 = new Car("BMW", "red", 2010);
        Car car3 = new Car("BMW", "black", 2020);
        Car car4 = new Car("BMW", "blue", 2012);
        Car car5 = new Car("BMW", "gray", 2016);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars;
    }
}
