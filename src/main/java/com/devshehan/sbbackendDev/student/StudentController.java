package com.devshehan.sbbackendDev.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(){
        this.studentService = new StudentService();
    }

    @GetMapping("/")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
