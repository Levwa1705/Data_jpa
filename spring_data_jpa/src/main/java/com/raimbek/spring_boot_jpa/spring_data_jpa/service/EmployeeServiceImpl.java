package com.raimbek.spring_boot_jpa.spring_data_jpa.service;

import com.raimbek.spring_boot_jpa.spring_data_jpa.dao_Repository.EmployeeRepository;
import com.raimbek.spring_boot_jpa.spring_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getListEmployees() {
        List employeeList = employeeRepository.findAll(); // Select * from Employees // Это запрос Read
        return  employeeList;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee= null;
      Optional<Employee> optional = employeeRepository.findById(id); // read запрос Круд системы
      if (optional.isPresent())
          employee= optional.get();
      return employee;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee); // create method crud operation

    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employeeList= employeeRepository.findALLByName(name);
        return employeeList;
    }

}
