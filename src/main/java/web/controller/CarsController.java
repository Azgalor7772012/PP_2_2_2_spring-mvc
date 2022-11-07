package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
public class CarsController {

    @Autowired
    private CarDAO carDAO;


    @GetMapping("/cars")
    public String getAmountCars(@RequestParam(value = "count", defaultValue = "5") Integer count,
                                Model model) {

            if (count < 0 || count > 5) {
                count = 5;
                model.addAttribute("Cars", carDAO.returnAmountOfCars(count));
            } else {
                model.addAttribute("Cars", carDAO.returnAmountOfCars(count));
            }

        return "cars";
    }
}
