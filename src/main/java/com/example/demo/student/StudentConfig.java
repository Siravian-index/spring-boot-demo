package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student david = new Student(
                    "David", "test1@gmail.com", LocalDate.of(1998, DECEMBER, 6)
            );
            Student alex = new Student(
                    "Alex", "Alex@gmail.com", LocalDate.of(1996, JANUARY, 5)
            );
            studentRepository.saveAll(List.of(david, alex));
        };
    }
}
