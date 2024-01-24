////////////////////////////////////////////////////////////////////////////////
// Created By Etienne KOA
////////////////////////////////////////////////////////////////////////////////

package com.etienne.client;

import com.etienne.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ClientTest {

	public static void main(String[] args) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()){

			//Check MySQL database version
			String sql = "select version()";
			String result = (String) session.createNativeQuery(sql).getSingleResult();
			System.out.println("MySQL Database Version is ::::");
			System.out.println(result);
 		} catch (HibernateException e){
			e.printStackTrace();
		}
	}
}
