package com.example.demo.serivceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Student addStudent(Student stud) {
		return repo.save(stud);
	}

	@Override
	public Student updateStudent(Long id, Student stud) {
		if (repo.existsById(id)) {
			stud.setId(id);
			return repo.save(stud);
		} else {
			return null;
		}
	}

	@Override
	public void deleteStudent(Long id) {
		repo.deleteById(id);
	}
}
