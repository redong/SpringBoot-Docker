package com.springbootseries.service.Interface;

import com.springbootseries.entity.Student;

import java.util.List;

/**
 * Created by rendong on 12/10/17.
 */
public interface StudentService {

    List<Student> findAll();

    Student findById(Integer id);

    Boolean deleteById(Integer id);

    Student create(Student student);

    Student update(Integer id, Student student);
}
