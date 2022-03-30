package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L, "David", "test@gmail.com", LocalDate.now().minusYears(23), 23));
    }

}
