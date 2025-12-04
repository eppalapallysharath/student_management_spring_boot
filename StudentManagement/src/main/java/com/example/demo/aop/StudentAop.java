package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;

@Aspect
@Component
public class StudentAop {
//	@After("execution(public * com.example.demo.service.StudentService.viewStudents() )")
//	
//	public void logAfter() {
//		System.out.println("all students are displayed");
//	}
//	@Before("execution(public * com.example.demo.service.StudentService.viewStudents() )")	
//	public void logBefore() {
//		System.out.println("ready to display students");
//	}
	
//	
//@Before("execution(public * com.example.demo.service.StudentService.addStudents(..))")
//
//	public void logBefore2() {
//	System.out.println("ready to insert data");
//	}
	
//	@Before("execution(public * com.example.demo.service.StudentService.getStudentById(int) )")
//
//	public void logBefore1() {
//	System.out.println("ready to get student by id");
//	}

//	 @After("execution(public * com.example.demo.service.StudentService.deleteStudentById(int))")
//	public void logAfter() {
//		LoggerFactory.getLogger(StudentAop.class).info("ready delete student by id");
//	}
//	 @Before("execution(public * com.example.demo.service.StudentService.deleteStudentById(int))")
//		public void logBefore() {
//			LoggerFactory.getLogger(StudentAop.class).warn("delete student by id");
//		}
	
//	 @AfterThrowing("execution(public *com.example.demo.service.StudentService.deleteStudentById(..))")
//		public void logException() {
//			LoggerFactory.getLogger(StudentAop.class).error("delete students are not displayed because of error");
//		}

//	@AfterReturning("execution(public * com.example.demo.service.StudentService.putStudentById(..))")
//	
//	public void logPut() {
//		System.out.println("all students are updated");
//	}
	 
	 @Around("execution(public * com.example.demo.service.StudentService.patchStudentById(..))")
		
		public void logPatch() {
		System.out.println("all students are updated");
		}
	
}

//package com.example.demo.service;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.model.Student;
//import com.example.demo.repo.StudentRepo1;
//
//@Service
//public class StudentService {
//
//
//	StudentRepo1 repo;
//	
//	 @Autowired
//	    public StudentService(StudentRepo1 repo) {
//	        this.repo = repo;
//	    }
//	public void addStudents(Student std) {
//	repo.save(std);
//		
//	}
//	public List<Student> viewStudents() {
//		
//		return repo.findAll();
//	}
//	public Student getStudentById(int id) {
//	
//		return repo.findById(id).orElse(new Student(1,"aa",20,"myloc"));
//		
//	}
//	public Student deleteStudentById(int id) {
//		
//		Student s=repo.findById(id).get();
//		repo.deleteById(id);
//		return s;
//	}
//	public Student putStudentById(int id, Student std) {
//		Student s=repo.findById(id).orElse(null);
//		if(s!=null) {
//			s.setName(std.getName());
//			s.setAge(std.getAge());
//			s.setLocation(std.getLocation());
//			repo.save(s);
//		}
//		return s;
//	}
//	
//	public Student patchStudentById(int id, Student std) {
//	
//			Student s = repo.findById(id).orElse(new Student());
//			if (std.getName() != null) {
//				s.setName(std.getName());
//			}
//			if (std.getAge() != 0) {
//				s.setAge(std.getAge());
//			}
//			if (std.getLocation() != null) {
//				s.setLocation(std.getLocation());
//			}
//
//			return repo.save(s);
//		
//		
//	}
//}
//	
