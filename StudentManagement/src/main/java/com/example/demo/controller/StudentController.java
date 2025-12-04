package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
//@CrossOrigin(origins = "http://localhost:5173")
@RestController

public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/student/add")
	public void addStudents(@RequestBody Student std) {
		service.addStudents(std);
	
	}

	@GetMapping("/student")
	public List<Student> viewStudents() {
		
		return service.viewStudents();
	
	}
	@GetMapping("/student/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable int id) {
		Student get=service.getStudentById(id);
		if(get==null) {
			return ResponseEntity.status(404).body("id not present");
		}
			
		return ResponseEntity.ok(get);
}
	@DeleteMapping("/student/{id}")
	public ResponseEntity<?> deleteStudentById(@PathVariable int id) {
		
		boolean deleted=service.deleteStudentById(id);
		if(!deleted) {
			return ResponseEntity.status(404).body("id not present");
		}
		
		
		return ResponseEntity.ok("deleted successfully");
		
}
	@PutMapping("/student/{id}")
	public ResponseEntity<?> putStudentById(@PathVariable int id, @RequestBody Student std) {
		Student updated=service.putStudentById(id, std);
		if(updated==null) {
			return ResponseEntity.status(404).body("Id not present");
		}
		
		return ResponseEntity.ok(updated);
	}
	@PatchMapping("/student/{id}")
	public ResponseEntity<?> patchStudentById(@PathVariable int id, @RequestBody Student std) {
		Student updated=service.patchStudentById(id, std);
		if(updated==null) {
			return ResponseEntity.status(404).body("id not present");
		}
		return ResponseEntity.ok(updated);
	}
}


