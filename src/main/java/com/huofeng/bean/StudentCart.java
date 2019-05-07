/*
 * File name:          StudentCart.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.bean;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          LF
 * <p>
 * Date:           2019年4月28日
 * <p>
 * Time:           下午8:34:00
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
public class StudentCart {
	private int id;
	private String number;
	private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
