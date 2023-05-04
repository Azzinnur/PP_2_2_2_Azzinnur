package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required = false) Integer count, ModelMap model) {
        model.addAttribute("cars", CarService.printCarTable(count));
        return "cars";
    }
}
