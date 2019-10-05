package zayed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/")
@SessionAttributes
@Controller
public class HomeController {

    @RequestMapping(value = {"/"})
    public String home() {
        return "index";
    }
}
