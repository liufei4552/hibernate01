/*
 * File name:          Husband.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          LF
 * <p>
 * Date:           2019年4月28日
 * <p>
 * Time:           下午7:58:24
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
@Entity
@Table(name = "Husband2")
public class Husband2 {
	private int id;
	private String name;
	private Wife2 wife2;

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

	@OneToOne
	/**用指定映射字段 */
	@JoinColumn(name = "wifeID")
	public Wife2 getWife2() {
		return wife2;
	}

	public void setWife2(Wife2 wife2) {
		this.wife2 = wife2;
	}

}
