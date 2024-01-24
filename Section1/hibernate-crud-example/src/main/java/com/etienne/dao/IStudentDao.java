package com.etienne.dao;

import com.etienne.model.Student;

import java.util.List;

public interface IStudentDao {
	void saveStudent(Student student);

	void updateStudent(Student student);

	Student getStudentById(long id);

	// @SuppressWarnings("unchecked")
	List<Student> getAllStudents();

	void deleteStudent(long id);
}
