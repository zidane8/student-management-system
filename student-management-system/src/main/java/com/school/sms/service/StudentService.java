package com.school.sms.service;

import java.util.List;

import com.school.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);

	Student getStudentById(Long id);
}
