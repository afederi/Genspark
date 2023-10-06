package org.example.Repository;

import org.example.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByemployeeId(long emp_id);

    List<Employee> findAllBydeptId(long dept_id);
}
