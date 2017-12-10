package com.springbootseries.service;

import com.springbootseries.entity.Student;
import com.springbootseries.exception.DemoException;
import com.springbootseries.repository.StudentRepository;
import com.springbootseries.service.Interface.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rendong on 12/10/17.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findOne(id);
    }

    @Override
    public boolean deleteById(Integer id) {
        return studentRepository.deleteById(id);
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Integer id, Student student) {

        Student existingStudent = findById(id);

        if (existingStudent == null) {
            throw new DemoException("No existing student. Id: " + id);
        }

        student.setId(existingStudent.getId());

        return studentRepository.save(student);
    }

}
