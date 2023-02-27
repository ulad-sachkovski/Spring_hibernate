package com.vsachkovsky.spring_project_v2.dao;

import com.vsachkovsky.spring_project_v2.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);
}
