package com.example.maylastweek.crud_practice;

import com.example.maylastweek.crud_practice.Model.Student_information;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student_information, Integer> {
}
