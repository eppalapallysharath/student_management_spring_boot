package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;


@Repository
public interface StudentRepo1 extends JpaRepository<Student, Integer> {





}
