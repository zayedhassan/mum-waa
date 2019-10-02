package mum.edu.controller;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.validator.Validator;

import java.util.List;

@Controller
public class CalculatorController {
    @AutoWired
    Validator validator;

    @RequestMapping(value = {"/"})
    public String showIndex(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/index.jsp";
    }

    @RequestMapping(value = {"/calculate"})
    public String calculate(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {
        List<String> errors = validator.validate(calculator);
        String sum, product;
        if (errors.isEmpty()) {
            try {
                Integer add1 = calculator.getAdd1();
                Integer add2 = calculator.getAdd2();
                sum = "" + (add1 + add2);
                calculator.setSum(sum);
            } catch (Exception e) {
                e.printStackTrace();
                sum = "";
                calculator.setSum(sum);
            }
            try {
                Integer mult1 = calculator.getMult1();
                Integer mult2 = calculator.getMult2();
                product = "" + (mult1 * mult2);
                calculator.setProduct(product);
            } catch (Exception e) {
                e.printStackTrace();
                product = "";
                calculator.setProduct(product);
            }
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/result.jsp";
        } else {
            request.setAttribute("errors", errors);
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/result.jsp";
        }
    }
}
