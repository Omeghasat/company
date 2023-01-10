package com.example.company.controller;

import com.example.company.model.Employee;
import com.example.company.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping ("/employee")

public class EmployeeController {
    @Autowired
    EmployeeService service;
    @GetMapping("/all")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployee();
    }

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee){
         service.addEmployee(employee);
    }
    @GetMapping("/getByempno/{empno}")
    public Employee getEmployeebyId(@PathVariable("empno") int empno){
        return service.getEmployeeByempno(empno);
    }
    @GetMapping("/getByName/{name}")
    public List<Employee> getEmployeeByName (@PathVariable("empno") String name){
        return service.getEmployeeByName(name);
    }

}

