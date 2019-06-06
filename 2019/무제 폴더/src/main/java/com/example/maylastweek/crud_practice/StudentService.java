package com.example.maylastweek.crud_practice;

import com.example.maylastweek.crud_practice.Model.Student_information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void create_stuInfo(Student_information student_information) {
        studentRepository.save(student_information);
}
}
