package io.francoisbotha.accountingdatagenerator.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @GetMapping("/customers")
    public ModelAndView getCustomers() {
        ModelAndView modelAndView = new ModelAndView("customers");
        return modelAndView;
    }

}
