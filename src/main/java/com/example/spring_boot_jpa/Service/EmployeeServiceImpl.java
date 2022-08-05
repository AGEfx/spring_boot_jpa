package com.example.spring_boot_jpa.Service;

import com.example.spring_boot_jpa.DAO.EmployeeRepository;
import com.example.spring_boot_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee car) {
        employeeRepository.save(car);
    }

    @Override
    public Employee getEmployee(int id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        return optional.get();
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllByDepartment(String department) {
        return employeeRepository.getAllByDepartment(department);
    }


}
