package com.devshehan.sbbackendDev.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Shehaan",
                        "devshehan@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,24),
                        24
                )
        );
    }
}
