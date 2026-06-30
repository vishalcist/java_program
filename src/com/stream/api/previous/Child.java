package com.check.codepractice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Child extends Parent {
	
	Child() {
		super();
	}
	
Child(String s) {
	super(s);
	
	}

Child(Integer i) {
	super(1);
}

Child(String s, Integer i) {
	super(s, i);
}
	
	@Override
public String show(String s) {
		System.out.println("one string argument");
		return null;
	}
	
	public String show() {
		System.out.println("no argument");
		return null;
		
	}
	public static String show(Integer s) {
		System.out.println("one integer argument");
		return null;
	}

	public static String  show(String s, String ss) {
		System.out.println("two argument");
		return null;
	}

	public static void main(String[] args) {
//		Child c = new Child();
//		Parent cc = new Child("vk", 2);
//		c.show("vk", "vk");
		
		
		List<String> s = Arrays.asList("VISHAL", "kabir", "vinay", "dipak");
		List<String> ss = Arrays.asList("VISHAL", "vijay", "vinay", "dipak");
		System.out.println(s.stream().count());;
		System.out.println(s.stream().findAny().orElse(null));
		System.out.println("===========");
		s.stream().filter(x -> !x.contentEquals("VISHAL")).forEach(System.out::println);
		System.out.println("===========");
		Stream.concat(s.stream(), ss.stream()).map(String::toUpperCase).distinct().forEach(System.out::println);
	}
	
	
}
