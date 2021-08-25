package com.raimbek.spring_boot_jpa.spring_data_jpa.dao_Repository;


import com.raimbek.spring_boot_jpa.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findALLByName(String name);
}
