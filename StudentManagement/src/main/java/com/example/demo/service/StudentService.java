package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo1;

@Service
public class StudentService {


	StudentRepo1 repo;
	
	 @Autowired
	    public StudentService(StudentRepo1 repo) {
	        this.repo = repo;
	    }
	public void addStudents(Student std) {
	repo.save(std);
		
	}
	public List<Student> viewStudents() {
		
		return repo.findAll();
	}
	public Student getStudentById(int id) {
	
		return repo.findById(id).orElse(null);
		
	}
	public boolean deleteStudentById(int id) {
		
		if(!repo.existsById(id)) {
			return false;
		}
		repo.deleteById(id);
		return true;
	}
	public Student putStudentById(int id, Student std) {
		Student s=repo.findById(id).orElse(null);
		if(s!=null) {
			s.setName(std.getName());
			s.setAge(std.getAge());
			s.setLocation(std.getLocation());
			repo.save(s);
		}
		return s;
	}
	
	public Student patchStudentById(int id, Student std) {
	
			Student s = repo.findById(id).orElse(new Student());
			if (std.getName() != null) {
				s.setName(std.getName());
			}
			if (std.getAge() != 0) {
				s.setAge(std.getAge());
			}
			if (std.getLocation() != null) {
				s.setLocation(std.getLocation());
			}

			return repo.save(s);
		
	}
}