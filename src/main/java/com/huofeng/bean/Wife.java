/*
 * File name:          Wife.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          LF
 * <p>
 * Date:           2019年4月28日
 * <p>
 * Time:           下午7:59:22
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
@Entity
public class Wife {
	private int id;
	private String name;

	@Id
	@GeneratedValue
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
}
