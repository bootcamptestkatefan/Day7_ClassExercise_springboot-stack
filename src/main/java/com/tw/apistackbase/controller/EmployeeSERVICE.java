package com.tw.apistackbase.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

public class EmployeeSERVICE{

    public EmployeeSERVICE(List<Employee> employees) {
        this.employees = new ArrayList<>();
    }

    private List<Employee> employees;

    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        return employees;
    }

    public int createEmployee(Employee employee){
        return 1;
    }
}