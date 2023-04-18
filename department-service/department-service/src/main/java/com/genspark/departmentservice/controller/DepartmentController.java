package com.genspark.departmentservice.controller;

import com.genspark.departmentservice.entity.Department;
import com.genspark.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department depot){
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(depot);
    }

    @GetMapping("/{id}")
    public Department findDepartment(@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }


}
