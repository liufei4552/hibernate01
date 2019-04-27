/*
 * File name:          TeacherTest.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.huofeng.bean.Teacher;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          LF
 * <p>
 * Date:           2019年4月27日
 * <p>
 * Time:           上午11:01:36
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
public class TeacherTest {

	public static void main(String[] args) {
		//注解式
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("liufei");
		teacher.setTitle("英文");

		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
