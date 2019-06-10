package com.example.blog.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Posting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="number")
    private Integer number;

    @Column(name = "time")
    private String time;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;
}
