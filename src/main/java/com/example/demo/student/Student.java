package com.example.demo.student;

import java.time.LocalDate;

public record Student( Long id, String name, String email, LocalDate dob, Integer age) {
}
