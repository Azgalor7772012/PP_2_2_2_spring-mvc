package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.CarDAO;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {

    @Autowired
    private CarDAO carDAO;


    @GetMapping("/cars")
    public String getAmountCars(HttpServletRequest request,
                                Model model) {

        String amount = request.getParameter("count");

        if (amount != null) {
            int integerAmount = Integer.parseInt(amount);

            if (integerAmount < 0 || integerAmount > 5) {
                model.addAttribute("Cars", carDAO.getCars());
            } else {
                model.addAttribute("Cars", carDAO.returnAmountOfCars(integerAmount));
            }

        } else {
            model.addAttribute("Cars", carDAO.getCars());
        }

//

        return "cars";
    }
}
