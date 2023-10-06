package org.example.Services;

import org.example.Entity.Employee;

import java.util.List;
public interface EmployeeService {

    public Employee addEmployee(Employee e);

    public List<Employee> allEmployees();

    public Employee employeeByID(long emp_id);

    public Employee updateEmployee(Employee e);

    public Employee deleteEmployee(long emp_id);

    public List<Employee> allEmployeesByDepartmentID(long dep_id);

}
