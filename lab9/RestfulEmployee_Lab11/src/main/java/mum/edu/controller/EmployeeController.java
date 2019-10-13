package mum.edu.controller;

import mum.edu.domain.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/addEmp",method = RequestMethod.POST)
    public Employee addEmp(@Valid @RequestBody Employee employee){
        return employee;
    }




}
