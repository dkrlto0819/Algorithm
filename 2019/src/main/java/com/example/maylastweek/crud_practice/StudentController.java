package com.example.maylastweek.crud_practice;

import com.example.maylastweek.crud_practice.Model.Student_information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public void create_stuInfo(@RequestBody Student_information student_information){
        studentService.create_stuInfo(student_information);
    }
}
