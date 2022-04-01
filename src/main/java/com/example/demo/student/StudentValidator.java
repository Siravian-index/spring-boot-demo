package com.example.demo.student;

import java.util.Objects;

public class StudentValidator {

    static public boolean validateStudentString(Student student, String str, StudentValidatorType type) {
        if (type == StudentValidatorType.EMAIL) {
            return str != null && str.length() > 0 && Objects.equals(student.getEmail(), str);
        } else if (type == StudentValidatorType.NAME) {
            return str != null && str.length() > 0 && Objects.equals(student.getName(), str);
        } else {
            throw new IllegalStateException("Type must be provided");
        }
    }
}

enum StudentValidatorType {
    EMAIL,
    NAME
}