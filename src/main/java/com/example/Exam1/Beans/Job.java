package com.example.Exam1.Beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Job {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private Date endDate;

}
