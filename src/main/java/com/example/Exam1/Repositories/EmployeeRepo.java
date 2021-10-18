package com.example.Exam1.Repositories;

import com.example.Exam1.Beans.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    Employee findByName(String name);

    Employee findById(long id);

}
