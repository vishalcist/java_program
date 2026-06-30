package com.check.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

	public static void main(String[] args) {
		StreamApiExample sae = new StreamApiExample();
		List<String> l = Arrays.asList("aman", "vishal","dineshwar", "kaverinand", "rajeshwar");
		// sae.getUppercase(l);
		sae.lengthFilter(l);
		sae.sortingDefaultAndCustom();

	}
	
	public void getUppercase(List<String> l) {
		List<String> ll = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		ll.forEach(System.out::println);
	}

	public void lengthFilter(List<String> l) {
		List<String> ll = l.stream().filter(s -> s.length() >= 7).collect(Collectors.toList());
		ll.forEach(System.out::println);
		
		long l1l = l.stream().filter(s -> s.length() >= 7).count();
		System.out.println(l1l);
	}
	
	public void sortingDefaultAndCustom() {
		List<Integer> i = Arrays.asList(12,14,3,5,4,56,45,98);
		List<Integer> i1 = i.stream().sorted().collect(Collectors.toList());
		System.out.println("default sorting: " + i1);
		List<Integer> i2 = i.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		System.out.println("custom sorting: " + i2);
				
	}
	
}