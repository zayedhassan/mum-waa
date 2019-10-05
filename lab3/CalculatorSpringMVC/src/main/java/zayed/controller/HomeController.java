package zayed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/")
@Controller
public class HomeController {

    @RequestMapping(value = {"/"})
    public String home(Model model, HttpServletRequest request) {
        model.addAttribute("a","ola");
        request.setAttribute("a","hello");
        return "index";
    }
}
