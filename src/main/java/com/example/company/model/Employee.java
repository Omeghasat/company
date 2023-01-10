package com.example.company.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

    @Id
    private int empno;
    private String empname;
    private String empdesignation;
    private String empdepartment;

    public int getEmpid() {
        return empno;
    }

    public void setEmpid(int empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpdesignation() {
        return empdesignation;
    }

    public void setEmpdesignation(String empdesignation) {
        this.empdesignation = empdesignation;
    }

    public String getEmpdepartment() {
        return empdepartment;
    }

    public void setEmpdepartment(String empdepartment) {
        this.empdepartment = empdepartment;
    }


}

