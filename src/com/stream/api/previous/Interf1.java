package com.check.stream;

public interface Interf1 {

	public void m1();
	
	public default void newMethod() {
		System.out.println("this is Interf1 interface default method newMethod()");
	}
}
