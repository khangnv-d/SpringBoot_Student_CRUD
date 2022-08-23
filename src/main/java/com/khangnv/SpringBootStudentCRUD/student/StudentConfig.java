package com.khangnv.SpringBootStudentCRUD.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.NOVEMBER;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student khang1 = new Student(
//                    "Khang1",
//                    LocalDate.of(2000, NOVEMBER, 2),
//                    "nguyenvankhang1@gmail.com"
//            );
//
//            Student khang2 = new Student(
//                    "Khang2",
//                    LocalDate.of(2000, NOVEMBER, 2),
//                    "nguyenvankhang2@gmail.com"
//            );
//
//            repository.saveAll(
//                    List.of(khang1, khang2)
//            );
//        };
//    }
}
