/*
 * File name:          Test01.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.7.32
 */
package com.huofeng.test;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          LF
 * <p>
 * Date:           2019年4月27日
 * <p>
 * Time:           上午11:41:25
 * <p>
 * Director:        LF
 * <p>
 * <p>
 */
public class Test01 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 1);
		map.put("name", "liufei");
		map.put("age", 25);
		map.put("sex", "男");
		for (String str : map.keySet()) {
			System.out.println(str);
		}
		System.out.println("========================================================");
		for (Object obj : map.values()) {
			System.out.println(obj);
		}
	}

}
