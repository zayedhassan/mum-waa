package zayed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import zayed.domain.Calculator;
import zayed.service.Validator;

import java.util.List;

@RequestMapping("/calculate")
@Controller
public class CalculatorController {

    @Autowired
    private Validator validator;

    @RequestMapping(method = RequestMethod.GET)
    public String welcome() {
        return "calculate";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String calculate(Calculator calculator, RedirectAttributes redirectAttributes) {
        List<String> errors = validator.validate(calculator);
        if (errors.isEmpty()) {
            redirectAttributes.addFlashAttribute("calculator",calculator);
            redirectAttributes.addFlashAttribute("success","Here is the result");
            return "redirect:/calculate/result";
        } else {
            calculator.setErrors(errors);
            return "calculate";
        }
    }

    @GetMapping("/result")
    public String result(){
        return "result";
    }

}
