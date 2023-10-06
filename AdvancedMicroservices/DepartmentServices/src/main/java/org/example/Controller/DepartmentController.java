package org.example.Controller;

import org.example.Entity.Department;
import org.example.Service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @GetMapping("/")
    public String home(){
        return " WELCOME TO THE DEPARTMENT PAGE";
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.allDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentByID(@PathVariable String id){
        System.out.println("TEST: "+(Department)departmentService.departmentByID(Long.parseLong(id)));
        return departmentService.departmentByID(Long.parseLong(id));

    }

    @GetMapping("")
    public Department getDepartmentByID2(@RequestParam("id") String id){
        return departmentService.departmentByID(Long.parseLong(id));
    }

    @PostMapping(value={"/"})
    public Department addDepartment(@RequestBody Department d){
        return departmentService.addDepartment(d);
    }

    @PutMapping("/")
    public Department updateDepartment(@RequestBody Department d){
        return departmentService.updateDepartment(d);
    }

    @DeleteMapping("/removeDepartment/{id}")
    public Department deleteDepartment(@PathVariable String id){
        return departmentService.deleteDepartment(Long.parseLong(id));
    }



}
