package com.example.blog.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "password")
    private String password;

    @Column(name = "content")
    private String content;

    @Column(name = "time")
    private String time;
}
