package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student max = new Student(
                    "Max",
                    "belkinurban@gmail.com",
                    LocalDate.of(1995, 9, 5),
                    26
            );

            Student bob = new Student(
                    "Bob",
                    "hellobob@gmail.com",
                    LocalDate.of(1993, 2, 4),
                    28
            );

            Student alex = new Student(
                    "Alex",
                    "alexworld@gmail.com",
                    LocalDate.of(1997, 1, 12),
                    24
            );

            repository.saveAll(
                    List.of(max, bob, alex)
            );
        };
    }
}
