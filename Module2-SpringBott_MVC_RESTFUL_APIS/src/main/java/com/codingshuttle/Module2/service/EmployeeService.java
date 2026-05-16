package com.codingshuttle.Module2.service;

import com.codingshuttle.Module2.entities.EmployeeEntity;
import com.codingshuttle.Module2.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public EmployeeEntity getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity createAnEmployee(EmployeeEntity employee) {
       return employeeRepository.save(employee);
    }
}
