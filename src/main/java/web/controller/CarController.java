package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import service.CarService;
import service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, HttpServletRequest request) {
        int count = 5;
        List<Car> cars;
        CarService service = new CarServiceImpl();
        try{
            count = Integer.parseInt(request.getParameter("count"));
        } catch (NumberFormatException exc) {}
        if ((count >=1) && (count <=4)) {
            cars = service.printCarTable(count);
        } else {
            cars = service.printCarTable(5);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
