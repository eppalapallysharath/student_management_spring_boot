package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "student_seq", sequenceName = "student_sequence", allocationSize = 1)
    private int sid;

    private String name;

    // wrapper Integer allows null
  
    private int age;

    private String location;

    public Student() {}

    public Student(int sid, String name, int age, String location) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public int getSid() {
    	return sid; 
    	}
    public void setSid(int sid) {
    	this.sid = sid; 
    	}

    public String getName() { 
    	return name; 
    	}
    public void setName(String name) {
    	this.name = name;
    	}

    public int getAge() {
    	return age; 
    	}
    public void setAge(int age) { 
    	this.age = age; 
    	}

    public String getLocation() {
    	return location; 
    	}
    public void setLocation(String location) { 
    	this.location = location; 
    	}

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", location=" + location + "]";
    }
}
