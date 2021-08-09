package com.java.features;

import java.io.File;
import java.io.IOException;

import sun.security.x509.IssuingDistributionPointExtension;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Commit testing");
		File directory = new File("myfolder");
	//	directory.mkdir();
		
		
	//File f = new File(directory.getAbsolutePath(),"abcsd3.txt");
		directory.list();
		for (String string : directory.list()) {
			System.out.println(string);
			
		}
//	System.out.println(directory.list());
	

	}

}
