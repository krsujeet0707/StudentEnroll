package com.StudentEnroll.Edu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentEnroll.Edu.Model.Student;
import com.StudentEnroll.Edu.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	public StudentRepository p;

	@Override
	public List<Student> getAllStudents() {
		return p.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		return p.save(student);
	}
	

}
