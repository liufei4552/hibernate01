/*
 * File name:          Teacher.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          LF
 * <p>
 * Date:           2019年4月26日
 * <p>
 * Time:           下午7:57:22
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
@Entity
public class Teacher {
	private int id;
	private String name;
	private String title;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
