package zayed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomeController {

    @RequestMapping(value = {"/"})
    public String home() {
        return "index";
    }
}
