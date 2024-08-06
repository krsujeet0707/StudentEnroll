package com.StudentEnroll.Edu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentEnroll.Edu.Model.Subject;
import com.StudentEnroll.Edu.Repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
	public SubjectRepository k;

	@Override
	public List<Subject> getAllSubjects() {
		return k.findAll();
	}

}
