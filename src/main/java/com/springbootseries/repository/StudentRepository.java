package com.springbootseries.repository;

import com.springbootseries.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by rendong on 12/10/17.
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
    

}
