package com.java.features;

public  class MySinglton {
	
	private static MySinglton singleton= null;
	private MySinglton() {
		
	}
	
	public static  MySinglton getSinglton() {
		
		if(singleton ==null) {
			singleton = new MySinglton();
		}
		return singleton;
	}
	

}

