package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L, "David", "test@gmail.com", LocalDate.now().minusYears(23), 23));
    }

}
