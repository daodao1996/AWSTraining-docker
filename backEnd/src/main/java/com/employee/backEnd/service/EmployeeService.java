package com.employee.backEnd.service;

import com.employee.backEnd.contracts.Employee;
import com.employee.backEnd.contracts.EmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {
  private final EmployeeRepository employeeRepository;

  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public List<Employee> getAllGoods() {
    return employeeRepository.findAll();
  }

  public boolean createGood(Employee employee){
    employeeRepository.save(employee);
    return true;
  }
}
