package com.etienne;

import com.etienne.model.Student;
import com.etienne.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class App {

	public static void main(String[] args) {

		Student student = new Student("Etienne", "KOA", "etienne@gmail.com");
		Student student1 = new Student("Jean", "Karl", "jean@mail.com");

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student objects
			session.save(student);
			session.save(student1);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			List<Student> students = session.createQuery("from Student", Student.class).list();
			students.forEach(s -> {
				System.out.println("Print student email id : " + s.getEmail());
			});
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
