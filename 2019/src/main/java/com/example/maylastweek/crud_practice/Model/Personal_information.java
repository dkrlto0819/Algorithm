package com.example.maylastweek.crud_practice.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="personal_information")
public class Personal_information {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String phone;
    private String email;
}
