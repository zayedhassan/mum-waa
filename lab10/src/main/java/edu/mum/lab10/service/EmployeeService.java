package edu.mum.lab10.service;

import edu.mum.lab10.model.Employee;
import edu.mum.lab10.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> locateOneEmployeeByHisNumber(String number){
        return employeeRepository.locateOneEmployeeByHisNumber(number);
    }
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public void updateEmployee(Employee employee){
        employeeRepository.save(employee);
    }
}
