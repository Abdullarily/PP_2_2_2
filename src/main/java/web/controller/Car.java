package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;

@Controller
public class Car {

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, @RequestParam(value = "count", required = false) int count) {
        CarService carService = new CarService();
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Opel");
        cars.add("Ford");

        model.addAttribute("cars", carService.getCars(cars, count));

        return "cars";
    }

}
