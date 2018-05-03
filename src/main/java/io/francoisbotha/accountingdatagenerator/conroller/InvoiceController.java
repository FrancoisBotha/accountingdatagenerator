package io.francoisbotha.accountingdatagenerator.conroller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.servlet.ModelAndView;

@Controller
public class InvoiceController  {

    @GetMapping("/invoices")
    public ModelAndView getVendors() {
        ModelAndView modelAndView = new ModelAndView("invoices");
        return modelAndView;
    }

}