/*
 * File name:          StudentTest.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.Test;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          LF
 * <p>
 * Date:           2019年4月27日
 * <p>
 * Time:           下午4:54:25
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
public class StudentTest {

	@Test
	public void test() {
		//		配置文件式
		Student student = new Student();

		student.setName("lifei");
		student.setAge(35);

		/*Configuration cfg = new Configuration();*/
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
