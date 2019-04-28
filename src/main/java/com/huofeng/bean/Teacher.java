/*
 * File name:          Teacher.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

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
/**当数据库的表名和类名不一致时使用table进行指出 */
@Table(name = "Teacher")
public class Teacher {
	private int id;
	private String name;
	private String title;
	private String subject;
	private Date biethday;

	/** 时间格式化 */
	@Temporal(TemporalType.DATE)
	public Date getBiethday() {
		return biethday;
	}

	public void setBiethday(Date biethday) {
		this.biethday = biethday;
	}

	/** 此注解是表示此属性不参与操作 */
	@Transient
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 数据库表属性和实体类属性不一致时
	 */
	@Column(name = "name")
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
