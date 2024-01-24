package com.etienne;

import com.etienne.model.Student;
import com.etienne.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {

		Student student = new Student("Etienne", "KOA", "etienne@gmail.com");
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()){

			// Start the transaction
			transaction = session.beginTransaction();

			// Save student object
			session.save(student);

			// Commit transaction
			transaction.commit();

		} catch (Exception e){
			if(transaction != null){
				transaction.rollback();
			}
		}
	}
}
