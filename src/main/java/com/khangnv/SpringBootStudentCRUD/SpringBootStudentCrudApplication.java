package com.khangnv.SpringBootStudentCRUD;

import com.khangnv.SpringBootStudentCRUD.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class SpringBootStudentCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentCrudApplication.class, args);
	}
}
