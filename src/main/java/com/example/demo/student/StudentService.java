package com.example.demo.student;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Max",
                        "belkinurban@gmail.com",
                        LocalDate.of(1995, 9, 5),
                        26
                )
        );
    }
}
