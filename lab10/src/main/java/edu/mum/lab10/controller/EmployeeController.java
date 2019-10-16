package edu.mum.lab10.controller;

import edu.mum.lab10.model.Employee;
import edu.mum.lab10.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping({"/list", "/", ""})
    public String showEmployeeLists(Model model){
        model.addAttribute("employees", employeeService.getAllEmployee());
        model.addAttribute("empNumber","");
        return "employeeList";
    }

    @GetMapping("/employeeAdd")
    public String showAddForm(@ModelAttribute Employee employee){
        return "employeeAdd";
    }

    @PostMapping("/employeeAdd")
    public String addEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result){
        if(result.hasErrors()){
            System.out.println("employee = " + employee);
            return "employeeAdd";
        }
        employeeService.updateEmployee(employee);
        return  "redirect:/list";
    }
    @GetMapping("/employeeSearch")
    public String getEmployeeByNumber(@RequestParam(value = "empNumber", required = false) String empNumber, Model model){
        System.out.println("empNumber = " + empNumber);
        System.out.println("employeeService.locateOneEmployeeByHisNumber(empNumber) = " +
                employeeService.locateOneEmployeeByHisNumber(empNumber));
        model.addAttribute("employees", employeeService.locateOneEmployeeByHisNumber(empNumber));
        return "employeeList";
    }



}
