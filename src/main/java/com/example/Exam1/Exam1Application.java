package com.example.Exam1;

import com.example.Exam1.Utils.Art;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exam1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exam1Application.class, args);

		System.out.println(Art.ok);

	}


}
