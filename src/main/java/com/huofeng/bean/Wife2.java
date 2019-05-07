/*
 * File name:          Wife.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
 * Time:           下午7:59:22
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
@Entity
@Table(name = "Wife2")
public class Wife2 {
	private int id;
	private String name;
	private Husband2 Husband2;

	@Id
	/** 主键自生成且会自动识别mysql还是oracle */
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

	/** 是告诉hibernate外键已在husband中生成无需再次生成 */
	@OneToOne(mappedBy = "wife2")
	public Husband2 getHusband2() {
		return Husband2;
	}

	public void setHusband2(Husband2 husband2) {
		Husband2 = husband2;
	}

}
