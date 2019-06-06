package com.example.entity.junefifth.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // 얘 안해주면 자동 auto 됨. 그냥 알아서 맞춰주는데 자동으로 전략을 맞춰주기 때문에...
    @Column(name="subject_id")
    int subject_id;

    @Column(name="subject_name")
    String subject_name;

    @Column(name="professor")
    String professor;
}
