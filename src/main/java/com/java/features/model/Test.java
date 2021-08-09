package com.java.features.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Test {


	public static void main(String[] args) {
	System.out.println(getExcept());


}
	public static int getExcept() {
		try {
		//	System.out.println(10/0);
		
		}catch(Exception e) {
			e.toString();
			return 11;
		}finally {
			System.out.println("fianlly");
		}
		return 12;
	}
}