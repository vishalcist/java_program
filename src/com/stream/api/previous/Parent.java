package com.check.codepractice;

public class Parent {
	
	Parent() {
		System.out.println("Parent constructor no argument");
	}
Parent(String s) {
	System.out.println("Parent constructor one String argument = " + s);
	
	}
Parent(Integer s) {
	System.out.println("Parent constructor one Integer argument =" + s );
}
Parent(String s, int i) {
	System.out.println("Parent constructor one string and one int argument=" + s + " and " + i);
}
	

	public Object show(String s) {
		return null;
	}

}
