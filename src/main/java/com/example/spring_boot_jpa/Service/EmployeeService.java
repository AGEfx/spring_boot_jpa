package com.example.spring_boot_jpa.Service;

import com.example.spring_boot_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee car);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
    public List<Employee> getAllByDepartment(String department);
}
