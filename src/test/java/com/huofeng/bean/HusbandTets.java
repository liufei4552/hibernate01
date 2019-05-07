/*
 * File name:          TeacherTets.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.bean;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          LF
 * <p>
 * Date:           2019年4月27日
 * <p>
 * Time:           下午4:47:21
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
public class HusbandTets {
	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	@Test
	public void test() {
		//注解式
		Teacher teacher = new Teacher();
		teacher.setName("liufei");
		teacher.setTitle("英文");
		teacher.setBiethday(new Date());

		/*Configuration cfg = new AnnotationConfiguration();*/
		/*SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();*/
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
		session.close();
		/*sf.close();*/
	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}
}
