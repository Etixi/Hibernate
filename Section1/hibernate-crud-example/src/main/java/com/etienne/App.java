package com.etienne;

import com.etienne.dao.IStudentDao;
import com.etienne.dao.StudentDao;
import com.etienne.model.Student;

import java.util.List;

public class App {

	public static void main(String[] args) {

		IStudentDao studentDao = new StudentDao();

		// test saveStudent
		Student student = new Student("Etienne", "KOA", "etienne@gmail.com");
		studentDao.saveStudent(student);

		// test updateStudent
		student.setFirstName("Etixi");
		studentDao.updateStudent(student);

		// test getStudentById
		Student student2 = studentDao.getStudentById(student.getId());

		// test getAllStudents
		List<Student> students = studentDao.getAllStudents();
		printStudentIds(students);

		// test deleteStudent
		studentDao.deleteStudent(student.getId());

	}

	private static void printStudentIds(List<Student> students) {
		if (students != null && !students.isEmpty()) {
			students.forEach(student -> System.out.println(student.getId()));
		} else {
			System.out.println("No students found.");
		}
	}
}

