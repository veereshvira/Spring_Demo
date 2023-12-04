package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student getStudentById(Long id);

	Student addStudent(Student stud);

	Student updateStudent(Long id, Student stud);

	void deleteStudent(Long id);
}
