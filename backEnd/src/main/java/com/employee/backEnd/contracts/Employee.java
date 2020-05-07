package com.employee.backEnd.contracts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotNull
  private String name;

  public Employee(@NotNull String name) {
    this.name = name;
  }

  public Employee() {
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}

