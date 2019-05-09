package com.example.spring.study.crud;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "Student") // 도메인 이름이 Student
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hackbun")
    private String hackbun;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;
}
