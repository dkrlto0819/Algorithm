package com.example.spring.study.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired // service를 연결해준다
    private StudentService studentService;

    @PostMapping // http method : post
    public void create(@RequestBody Student student) { // request body의 student를 인식해라!
        studentService.create(student);
    }

    @GetMapping
    public List<Student> list() {
        return studentService.list();
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable Integer id) {
        return studentService.get(id);
    }

    @PutMapping
    public void update(@RequestBody Student student) {
        studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        studentService.delete(id);
    }

}
