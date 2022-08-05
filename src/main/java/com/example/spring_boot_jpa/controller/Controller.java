package com.example.spring_boot_jpa.controller;

import com.example.spring_boot_jpa.Service.EmployeeService;
import com.example.spring_boot_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllCars(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee car = employeeService.getEmployee(id);
//        if (car == null){
//            throw new NoSuchCarException("Машины с id = " + id + " не существует");
//        }

        return car;
    }

    @PostMapping("/employees")
    public Employee addCar(@RequestBody Employee car){
        employeeService.saveEmployee(car);
        return car;
    }
    @PutMapping("/employees")
    public Employee editCar(@RequestBody Employee car){
        employeeService.saveEmployee(car);
        return car;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteCar(@PathVariable int id){
        Employee car = employeeService.getEmployee(id);
        if (car != null) {
            employeeService.deleteEmployee(id);

        }return "Машина с id = " + id + " была успешно удалена";
//        }else{
//            throw new NoSuchCarException("Машины с id = " + id + " не существует");
//        }
}
    @GetMapping("/employees/department/{department}")
    public List<Employee> getAllByName(@PathVariable String department){
        return employeeService.getAllByDepartment(department);
    }

}
