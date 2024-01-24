package com.etienne.dao;

import com.etienne.model.Student;
import com.etienne.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao implements IStudentDao {

	// save Student
	// get All Students
	// get Student By Id
	// Update Student
	// Delete Student

	@Override
	public void saveStudent(Student student){
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()){

			// start the transaction
			transaction = session.beginTransaction();

			// save student object
			session.save(student);

			// commit the transaction
			transaction.commit();

		} catch (Exception e){
			if(transaction != null){
				transaction.rollback();
			}
		}
	}

	@Override
	public void updateStudent(Student student){

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()){

			// start the transaction
			transaction = session.beginTransaction();

			// save student
			session.saveOrUpdate(student);

			// commit the transaction
			transaction.commit();

		} catch (Exception e){
			if(transaction != null){
				transaction.rollback();
			}
		}
	}

	@Override
	public Student getStudentById(long id){

		Transaction transaction = null;
		Student student = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()){

			// start the transaction
			transaction = session.beginTransaction();

			// save student
			 student = session.get(Student.class, id);
			// student = session.load(Student.class, id);

			// commit the transaction
			transaction.commit();

		} catch (Exception e){
			if(transaction != null){
				transaction.rollback();
			}
		}
		return student;
	}

	// @SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents(){

		Transaction transaction = null;
		List<Student> students = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()){

			// start the transaction
			transaction = session.beginTransaction();

			// save student
			students = session.createQuery("from Student").list();


			// commit the transaction
			transaction.commit();

		} catch (Exception e){
			if(transaction != null){
				transaction.rollback();
			}
		}
		return students;
	}

	@Override
	public void deleteStudent(long id){

		Transaction transaction = null;
		Student student = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()){

			// start the transaction
			transaction = session.beginTransaction();

			student = session.get(Student.class, id);

			// get student object
			session.delete(student);
			// session.load(Student.class, id);

			// commit the transaction
			transaction.commit();

		} catch (Exception e){
			if(transaction != null){
				transaction.rollback();
			}
		}
	}
}
