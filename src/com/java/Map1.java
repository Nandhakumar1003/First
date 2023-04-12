package com.java;

import java.util.HashMap;
import java.util.Map;
// Day 9(Ques 1.1) 
public interface Map1 {
	public static void main(String[] args) {
		Map a = new HashMap();
		a.put("\n" + 10, "java" + "\n");
		a.put("\n" + 20, "sql" + "\n");
		a.put("\n" + 30, "oops" + "\n");
		a.put("\n" + 40, "sql" + "\n");
		a.put("\n" + 50, "oracle" + "\n");
		a.put("\n" + 60, "DB" + "\n");
		a.put("\n" + 10, "selenium" + "\n");
		a.put("\n" + 50, "psql" + "\n");
		a.put("\n" + 40, "Hadoop" + "\n");
		System.out.println(a);

	}
}
