package com.etienne;

import com.etienne.dao.StudentDao;
import com.etienne.model.Student;

public class App {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDao();

		Student student = new Student("Etienne", "KOA", "etienne@mail.com");

		System.out.println(student.getId());
	}
}
