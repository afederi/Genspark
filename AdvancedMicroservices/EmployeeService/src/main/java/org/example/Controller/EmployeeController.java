package org.example.Controller;

import org.example.Entity.Employee;
import org.example.Services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/")
    public String home(){return "WELCOME TO THE EMPLOYEE PAGE";}

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.allEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id")String emp_id){
        return employeeService.employeeByID(Long.parseLong(emp_id));
    }

    @GetMapping("employees/department/{id}")
    public List<Employee> getAllEmployeesByDepartment(@PathVariable("id") String emp_id){
        return employeeService.allEmployeesByDepartmentID(Long.parseLong(emp_id));
    }



    @PostMapping("/")
    private Employee addEmployee(@RequestBody Employee e){
        return employeeService.addEmployee(e);
    }

    @DeleteMapping("/delete/{id}")
    public Employee updateEmploye(@PathVariable("id") String emp_id){
        return employeeService.deleteEmployee(Long.parseLong(emp_id));
    }







}
