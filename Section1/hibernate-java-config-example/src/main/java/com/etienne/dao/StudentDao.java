package com.etienne.dao;

import com.etienne.model.Student;
import com.etienne.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao {

	public void saveStudent(Student student) {

		Transaction transaction = null;

		// auto close session object
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			session.beginTransaction();

			// save student object
			session.save(student);

			// commit transaction
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}

	}

	public List<Student> getStudents() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Student", Student.class).list();
		}

	}
}