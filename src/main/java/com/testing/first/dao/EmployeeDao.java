package com.testing.first.dao;

import com.testing.first.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);
    void delete(int id);

}
