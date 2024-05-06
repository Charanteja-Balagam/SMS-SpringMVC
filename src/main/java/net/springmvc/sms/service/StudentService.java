package net.springmvc.sms.service;

import java.util.List;

import net.springmvc.sms.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);

}
