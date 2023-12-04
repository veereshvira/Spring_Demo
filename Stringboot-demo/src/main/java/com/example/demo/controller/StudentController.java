package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/getall")
	public List<Student> getAll() {
		return studentService.getAllStudent();
	}

	@GetMapping("/getbyid/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/addStudent")
	public Student AddStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "Student Data Deleted Successfully";
	}
}
