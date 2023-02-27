package com.vsachkovsky.spring_project_v2.service;

import com.vsachkovsky.spring_project_v2.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);
}
