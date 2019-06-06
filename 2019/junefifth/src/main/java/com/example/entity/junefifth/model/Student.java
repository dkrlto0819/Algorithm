package com.example.entity.junefifth.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    int id;

    @Column(name="hackbun")
    String hackbun;

    @Column(name="birthday")
    String birthday;

}
