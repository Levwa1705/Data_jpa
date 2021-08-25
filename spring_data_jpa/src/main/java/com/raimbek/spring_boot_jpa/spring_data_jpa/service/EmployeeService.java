package com.raimbek.spring_boot_jpa.spring_data_jpa.service;


import com.raimbek.spring_boot_jpa.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getListEmployees();
    public Employee getEmployeeById(int id);
    public void addEmployee(Employee employee);
    public void deleteEmployee(int id);
    public List<Employee> findAllByName(String name);
}
