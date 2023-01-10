package com.example.company.service;


import com.example.company.model.Employee;
import com.example.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repo;

    public List<Employee> getAllEmployee() {
        return repo.findAll();

    }

    public void addEmployee(Employee employee) {
        repo.save(employee);
    }

    public Employee getEmployeeByempno(int empno) {
        return repo.findById(empno).get();
    }
    public List<Employee> getEmployeeByName(String name) {
        return repo.findEmployeeByName(name);
    }

}
