package com.example.Exam1.Service;

import com.example.Exam1.Beans.Employee;
import com.example.Exam1.Beans.Job;
import com.example.Exam1.Repositories.EmployeeRepo;
import com.example.Exam1.Repositories.JobRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Company {

    private final EmployeeRepo employeeRepo;
    private final JobRepo jobRepo;

    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public Employee findEmployeeByID(long id){
        return employeeRepo.findById(id);
    }

    public Employee findEmployeeByName(String name){
        return employeeRepo.findByName(name);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public List<Job> findAllJobs() {
        return jobRepo.findAll();
    }

    public List<Job> findByEndDate(Date myDate){
        return jobRepo.findByEndDate(myDate);
    }

    public List<Job> findBetweenDate(Date firstDate, Date endDate){
        return jobRepo.findByEndDateBetween(firstDate,endDate);
    }

}
