package com.tw.apistackbase.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @RequestMapping(produces = {"application/json"})
    public List<Employee> getAll( ) {

        EmployeeService EmployeeSERVICE = new EmployeeService();
        List<Employee> employees = employeeService.getAll();
        EmployeeSERVICE

    }
    @PostMapping(produces = {"application/json"})
    public List<Employee> create(@RequestBody Employee employee){
        EmployeeService employeeService = new EmployeeService();
        List<Employee> employees = employeeService.getAll();
        return employees;

    }














    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}