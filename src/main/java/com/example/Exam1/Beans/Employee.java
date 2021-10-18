package com.example.Exam1.Beans;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double salary;

    @Singular
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    List<Job> jobs;
}
