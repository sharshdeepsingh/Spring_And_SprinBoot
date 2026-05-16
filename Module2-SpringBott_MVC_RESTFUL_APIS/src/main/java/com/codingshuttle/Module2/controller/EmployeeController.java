package com.codingshuttle.Module2.controller;

import com.codingshuttle.Module2.dto.EmployeeDTO;
import com.codingshuttle.Module2.entities.EmployeeEntity;
import com.codingshuttle.Module2.repository.EmployeeRepository;
import com.codingshuttle.Module2.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long employeeId){
       return employeeService.getEmployeeById(employeeId);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false) Integer age, @RequestParam(required = false) String title){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeEntity createAnEmployee(@RequestBody EmployeeEntity employee){
        return employeeService.createAnEmployee(employee);
    }
}
