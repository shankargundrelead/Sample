package com.java.features.model;

public class Structure {

	public static void main(String[] args) {
		
		TelevisionService tvset = new SonyTv();
	}
}

interface TelevisionService{
	
	void getChannel();
	void getSignal();
	
}

class SonyTv implements TelevisionService{

	public void getChannel() {
		System.out.println("sony tv chanel");
		
	}

	public void getSignal() {
		System.out.println("sony tv signal");
		
	}
	public void getRate() {
		System.out.println("sony tv Rate");
		
	}
	
	
}

