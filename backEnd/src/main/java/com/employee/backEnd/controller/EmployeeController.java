package com.employee.backEnd.controller;

import com.employee.backEnd.contracts.Employee;
import com.employee.backEnd.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }


  @GetMapping("/employees")
  public ResponseEntity<List<Employee>> getAllGoods() {
    List<Employee> allGoods = employeeService.getAllGoods();
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(allGoods);
  }

  @PostMapping("/employees")
  public ResponseEntity createGood(@RequestBody Employee employee) {
    employeeService.createGood(employee);
    return ResponseEntity
            .status(HttpStatus.CREATED).build();
  }

}
