package io.francoisbotha.accountingdatagenerator.conroller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController  {

    @GetMapping("/products")
    public ModelAndView getVendors() {
        ModelAndView modelAndView = new ModelAndView("products");
        return modelAndView;
    }

}