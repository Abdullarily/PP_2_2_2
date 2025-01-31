package web.service;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public List<String> getCars(List<String> cars, int count) {
        List<String> carsOut = new ArrayList<>();
        if (count >= cars.size()) {
            carsOut = cars;
        } else {
            for (int i = 0; i < count; i++) {
                carsOut.add(cars.get(i));
            }
        }
        return carsOut;
    }
}
