package com.springbootseries.controller;

import com.springbootseries.entity.Student;
import com.springbootseries.service.Interface.StudentService;
import com.springbootseries.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rendong on 12/10/17.
 */
@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.POST)
    public ResultBean<Student> create(@RequestBody Student student) {
        return new ResultBean<>(studentService.create(student));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResultBean<Student> update(@PathVariable Integer id, @RequestBody Student student) {
        return new ResultBean<>(studentService.update(id, student));
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public ResultBean<Boolean> deleteById(@PathVariable Integer id) {
        return new ResultBean<>(studentService.deleteById(id));
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResultBean<Student> findById(@PathVariable Integer id) {
        return new ResultBean<>(studentService.findById(id));
    }

    @RequestMapping(value="", method = RequestMethod.GET)
    public ResultBean<List<Student>> findAll() {
        return new ResultBean<>(studentService.findAll());
    }

}
