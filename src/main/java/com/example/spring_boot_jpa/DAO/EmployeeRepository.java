package com.example.spring_boot_jpa.DAO;


import com.example.spring_boot_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> getAllByDepartment(String department);

}
