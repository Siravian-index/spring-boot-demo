package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//declare the type of both obj (Student) and ID

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
