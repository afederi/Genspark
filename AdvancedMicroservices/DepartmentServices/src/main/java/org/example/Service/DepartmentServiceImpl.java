package org.example.Service;

import org.example.Entity.Department;
import org.example.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department addDepartment(Department d) {

        return departmentRepository.save(d);
    }

    @Override
    public List<Department> allDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department departmentByID(long dep_id) {
        return departmentRepository.findBydepartmentId(dep_id);
    }

    @Override
    public Department updateDepartment(Department d) {
        return departmentRepository.save(d);
    }

    @Override
    public Department deleteDepartment(long dep_id) {

        Department d = departmentRepository.findBydepartmentId(dep_id);
        departmentRepository.deleteById(dep_id);
        return d;
    }
}
