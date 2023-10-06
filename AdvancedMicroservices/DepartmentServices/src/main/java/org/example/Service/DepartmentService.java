package org.example.Service;

import org.example.Entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {

    public Department addDepartment(Department d);

    public List<Department> allDepartments();

    public Department departmentByID(long dep_id);

    public Department updateDepartment(Department d);

    public Department deleteDepartment(long dep_id);
}
