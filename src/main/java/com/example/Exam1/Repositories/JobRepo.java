package com.example.Exam1.Repositories;

import com.example.Exam1.Beans.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface JobRepo extends JpaRepository<Job, Integer> {

    List<Job> findByEndDate(Date date);

    List<Job> findByEndDateBetween(Date startDate, Date endDate);

}
