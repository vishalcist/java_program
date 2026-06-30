package com.check.stream;

public class AutoboxingUnboxing {
	
	
	public void m(int i) {
		System.out.println("int");
	}
	
//	public void m(long i) {
//		System.out.println("long");
//	}
//	
//	public void m(float i) {
//		System.out.println("float");
//	}
//	
//	
//	public void m(double i) {
//		System.out.println("double");
//	}
	
//	public void m(Integer i) {
//		System.out.println("Integer");
//	}
//	public void m(Long i) {
//		System.out.println("Long");
//	}
//	public void m(Float i) {
//		System.out.println("Float");
//	}
//	
//	public void m(Double i) {
//		System.out.println("Double");
//	}
//	
//	public void m(Number i) {
//		System.out.println("Number");
//	}

	public static void main(String[] args) {
//		char x = 'Z';
//		int y = x;
//		System.out.println(y);
		long x = 5;
		AutoboxingUnboxing u = new AutoboxingUnboxing();
		u.m(x);
	}

}
