package com.check.stream;

public class Interf1Implementation {
	
	public void m2() {
		System.out.println(" this is my Method reference");
	}

	public static void main(String[] args) {
		Interf1Implementation ii = new Interf1Implementation();
		
		Interf1 i = ii::m2;
		
		i.m1();

	}

}
