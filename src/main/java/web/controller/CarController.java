package web.controller;

import web.dao.CarDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    private final CarDaoImpl carDao;

    @Autowired
    public CarController(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String printListOfCars(@RequestParam(value = "count", required = false)
                                      Integer count, Model model) {
        model.addAttribute("cars", carDao.listOfCars(count));
        return "cars";
    }


}
