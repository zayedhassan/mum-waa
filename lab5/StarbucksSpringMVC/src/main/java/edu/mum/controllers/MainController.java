package edu.mum.controllers;

import edu.mum.data.DataFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    ServletContext context;

    @RequestMapping("/")
    public String Index() {
        return "login";
    }


    @GetMapping("/advice")
    public String Advice(Model model, @RequestParam String roast,HttpSession session) {
        Object v = session.getAttribute ("user");
        if(v!=null){
            DataFacade data = (DataFacade) context.getAttribute("dataSource");
            List<String> advice = data.getAdvice(roast);
            model.addAttribute("advice", advice);
            return "display";
        }else{
            model.addAttribute("msg","Login First");
            return "login";
        }
    }

    @PostMapping("/authenticate")
    public String Authenticate(Model model, @RequestParam String name, @RequestParam String password, HttpSession session) {

        DataFacade data = (DataFacade) context.getAttribute("dataSource");
        String expectedPassword = data.findPassword(name);

        if (expectedPassword == null || !expectedPassword.equals(password)) {
            model.addAttribute("msg","Username password did not match");
            return "login";
        } else {
            session.setAttribute("user",name);
            return "advice";
        }
    }

    @GetMapping("logout")
    public String logout(HttpSession session, RedirectAttributes redirectAttributes){
        session.invalidate();
        redirectAttributes.addFlashAttribute("msg","Logout Successful");
        return "redirect:/";
    }
}
