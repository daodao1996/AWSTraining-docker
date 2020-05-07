package com.employee.backEnd.contracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
