/*
 * File name:          StudentTest.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.huofeng.bean.Student;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          LF
 * <p>
 * Date:           
 * <p>
 * Time:          
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
public class StudentTest {
	public static void main(String[] args) {
		//		配置文件式
		Student student = new Student();
		student.setId(1);
		student.setName("lifei");
		student.setAge(15);

		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
