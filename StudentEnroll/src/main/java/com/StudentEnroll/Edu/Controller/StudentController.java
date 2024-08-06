 package com.StudentEnroll.Edu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentEnroll.Edu.Model.Student;
import com.StudentEnroll.Edu.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService t;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return this.t.getAllStudents();
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return this.t.addStudent(student);
	}

}
