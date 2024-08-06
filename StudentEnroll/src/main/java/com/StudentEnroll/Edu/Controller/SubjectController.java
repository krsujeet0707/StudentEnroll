package com.StudentEnroll.Edu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentEnroll.Edu.Model.Subject;
import com.StudentEnroll.Edu.Service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService x;
	
	@GetMapping("/subjects")
	public List<Subject> getAllSubjects(){
		return this.x.getAllSubjects();
	}

}
