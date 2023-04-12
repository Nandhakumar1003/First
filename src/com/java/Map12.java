package com.java;

import java.util.LinkedHashMap;
import java.util.Map;
//Ques 1.2
public interface Map12 {
	public static void main(String[] args) {
		Map a= new LinkedHashMap();
		a.put("\n"+10, 10+"\n");
		a.put("\n"+20, 20+"\n");
		a.put("\n"+30, 30+"\n");
		a.put("\n"+40, 40+"\n");
		a.put("\n"+50, 50+"\n");
		a.put("\n"+60, 60+"\n");
		a.put("\n"+10, 10+"\n");
		a.put("\n"+50, 50+"\n");
		a.put("\n"+40, 40+"\n");
		System.out.println(a);
		
	}
}
