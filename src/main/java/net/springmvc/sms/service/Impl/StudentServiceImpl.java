package net.springmvc.sms.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.springmvc.sms.entity.Student;
import net.springmvc.sms.repository.StudentRepository;
import net.springmvc.sms.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		
		
		
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	
	
	

}
