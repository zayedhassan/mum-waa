package com.students.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.students.domain.Student;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/registration")
@Controller
public class StudentController {

    @ModelAttribute("genders")
    public Map<String, String> Genders() {
        Map<String, String> genderMap = new HashMap<>();
        genderMap.put("Male", "Male");
        genderMap.put("Female", "Female");
        return genderMap;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showForm(@ModelAttribute("student") Student student, Model model) {
        return "registration";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        System.out.println(bindingResult);
        if (bindingResult.hasErrors()) {
            System.out.println(student.getPhone().getPrefix());
            return "registration";
        } else {
            redirectAttributes.addFlashAttribute("student", student);
            return "redirect:/registration/success";
        }
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String success() {
        return "success";
    }

}

	

