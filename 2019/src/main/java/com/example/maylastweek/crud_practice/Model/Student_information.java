package com.example.maylastweek.crud_practice.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student_information")
public class Student_information {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String password;
}


