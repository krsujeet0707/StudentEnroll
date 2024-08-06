package com.StudentEnroll.Edu.Service;

import java.util.List;

import com.StudentEnroll.Edu.Model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
    public Student addStudent(Student student);
}
