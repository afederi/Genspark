package org.example.Services;

import org.example.Entity.Employee;
import org.example.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee addEmployee(Employee e) {
        return employeeRepository.save(e);
    }

    public List<Employee> allEmployees() {
        return employeeRepository.findAll();
    }

    public Employee employeeByID(long emp_id) {
        return employeeRepository.findByemployeeId(emp_id);
    }

    public Employee updateEmployee(Employee e) {
        return employeeRepository.save(e);
    }

    public Employee deleteEmployee(long emp_id) {
        Employee e = employeeRepository.findByemployeeId(emp_id);
        employeeRepository.deleteById(emp_id);
        return e;
    }

    public List<Employee> allEmployeesByDepartmentID(long dep_id) {
        return employeeRepository.findAllBydeptId(dep_id);
    }
}
