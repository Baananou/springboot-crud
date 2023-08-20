package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yessine = new Student(
                    "yessine",
                    "yessine@test.tn",
                    LocalDate.of(2000, Month.OCTOBER, 4)
            );
            Student mohamed = new Student(
                    "mohamed",
                    "mohamed@test.tn",
                    LocalDate.of(2000, Month.OCTOBER, 4)
            );
            repository.saveAll(
                    List.of(yessine, mohamed)
            );
        };
    }
}
