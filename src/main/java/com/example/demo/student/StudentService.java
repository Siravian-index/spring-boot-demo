package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> generateStudents(int limit) {
        var r = new ArrayList<Student>();
        var longNumber = 1L;
        for (int i = 0; i < limit; i++) {
            var s = new Student(longNumber, "student " + i, "email" + i + "@gmail.com", LocalDate.now(), i + 20);
            longNumber++;
            r.add(s);
        }
        return r;
    }

    public ArrayList<Student> getStudents(int limit) {
        return generateStudents(limit);
    }

}
