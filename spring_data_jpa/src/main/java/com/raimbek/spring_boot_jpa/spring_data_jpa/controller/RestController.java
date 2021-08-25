package com.raimbek.spring_boot_jpa.spring_data_jpa.controller;


import com.raimbek.spring_boot_jpa.spring_data_jpa.entity.Employee;
import com.raimbek.spring_boot_jpa.spring_data_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> employeeList = employeeService.getListEmployees();
        return employeeList;
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        Employee employee = employeeService.getEmployeeById(id);
        return employee;
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
         employeeService.addEmployee(employee);
         return employee;
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        Employee employee =employeeService.getEmployeeById(id);

        employeeService.deleteEmployee(id);
        return  "Employee with id "+ id+ " was deleted";
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody  Employee employee){

        employeeService.addEmployee(employee);
        return employee;
    }
    @GetMapping("/employees/name/{name}")
    public List<Employee> getListEmployeeByName(@PathVariable String name){
        List<Employee> employeeList= employeeService.findAllByName(name);
        return employeeList;
    }

}
