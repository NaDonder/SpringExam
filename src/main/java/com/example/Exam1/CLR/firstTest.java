package com.example.Exam1.CLR;

import com.example.Exam1.Beans.Employee;
import com.example.Exam1.Beans.Job;
import com.example.Exam1.Service.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Order(1)
@RequiredArgsConstructor
public class firstTest implements CommandLineRunner {

    private final Company company;

    @Override
    public void run(String... args) throws Exception {

        //----------------------- CREATE 4 JOBS ------------------------

        Job job1 = Job.builder()
                .description("Clean the dishes")
                .endDate(Date.valueOf("2021-07-10"))
                .build();

        Job job2 = Job.builder()
                .description("Fold the sheets")
                .endDate(Date.valueOf("2021-07-10"))
                .build();

        Job job3 = Job.builder()
                .description("Start the washing machine")
                .endDate(Date.valueOf("2021-07-20"))
                .build();

        Job job4 = Job.builder()
                .description("Cook some food")
                .endDate(Date.valueOf("2021-07-20"))
                .build();

        //------------------- CREATE 2 EMPLOYEES ------------------------

        Employee employee1 = Employee.builder()
                .name("Best Worker")
                .salary(20_000)
                .job(job1)
                .job(job2)
                .build();

        Employee employee2 = Employee.builder()
                .name("Worst Worker")
                .salary(10_000)
                .job(job3)
                .job(job4)
                .build();

        //----------------- ADDING 2 EMPLOYEE ----------------

        company.addEmployee(employee1);
        company.addEmployee(employee2);

        //---------------- FIND EMPLOYEE BY ID -----------------

        System.out.println("First employee:");
        System.out.println(company.findEmployeeByID(1));
        System.out.println();
        System.out.println("Second employee:");
        System.out.println(company.findEmployeeByID(2));
        System.out.println();

        //----------------- FIND EMPLOYEE BY NAME -------------------

        System.out.println("Finding employee by name: Best Worker");
        System.out.println(company.findEmployeeByName("Best Worker"));
        System.out.println();
        System.out.println("Finding employee by name: Worst Worker");
        System.out.println(company.findEmployeeByName("Worst worker"));
        System.out.println();

        //------------------ SHOW ALL EMPLOYEES --------------------

        System.out.println("Showing all employees:");
        System.out.println(company.findAllEmployees());
        System.out.println();

        //---------------- SHOW ALL JOBS -------------------------

        System.out.println("Showing all jobs:");
        System.out.println(company.findAllJobs());
        System.out.println();

        //---------------- SHOW JOBS BY END DATE ----------------------

        System.out.println("Showing jobs by end date: ");
        System.out.println("Showing by 2021-07-10 end date: ");
        System.out.println(company.findByEndDate(Date.valueOf("2021-07-10")));
        System.out.println();
        System.out.println("Showing by 2021-07-20 end date: ");
        System.out.println(company.findByEndDate(Date.valueOf("2021-07-20")));

        //------------------ SHOW JOBS BETWEEN DATES ----------------------

        System.out.println("showing jobs between dates:");
        System.out.println("Showing jobs between dates 2021-07-05 to 2021-07-15 :");
        System.out.println(company.findBetweenDate(Date.valueOf("2021-07-05"),Date.valueOf("2021-07-15")));
        System.out.println();
        System.out.println("Showing jobs between dates 2021-07-05 to 2021-07-25 :");
        System.out.println(company.findBetweenDate(Date.valueOf("2021-07-05"),Date.valueOf("2021-07-25")));



    }
}
