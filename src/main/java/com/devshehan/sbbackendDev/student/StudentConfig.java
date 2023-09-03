package com.devshehan.sbbackendDev.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return  args -> {
            Student x  = new Student(
                    "Jack",
                    "jack@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 24)
            );

            Student y  = new Student(
                    "Rose",
                    "Rose@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 7)
            );
            repository.saveAll(
                    List.of(x,y)
            );
        };
    }
}
