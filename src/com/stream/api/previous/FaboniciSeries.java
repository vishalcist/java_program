package com.check.codepractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.check.model.Student;

public class FaboniciSeries {

	public static void main(String[] args) {
		FaboniciSeries f = new FaboniciSeries();
		f.fabseries(10);
		
		
		List<Integer> l = Arrays.asList(2, 4, 57, 9, 12, 54, 23, 65, 27);
        Collections.sort(l, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		l.forEach(System.out::println);
		
		 List<Student> students = Arrays.asList(
		            new Student(85, "Alice"),
		            new Student(92, "Bob"),
		            new Student(78, "Charlie"),
		            new Student(89, "Diana"),
		            new Student(95, "Eve")
		        );
		 
		 List<Student> list = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).collect(Collectors.toList());
		 list.forEach(System.out::println);
		 
		 // reverse the string
		 String name = "Hello vishal";
		 String rs = name.chars().mapToObj(c -> (char)c).map(String::valueOf).collect(Collectors.toList()).stream().reduce((a, b) -> b+a).orElse(" ");
		 System.out.println(rs);
		 
		 
		 List<List<String>> listOfLists = Arrays.asList(
		            Arrays.asList("Reflection", "Collection", "Stream"),
		            Arrays.asList("Structure", "State", "Flow"),
		            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
		        );
		 
		 List<String> ls = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		 System.out.println(ls);
		 ls.forEach(System.out::println);

	}

	public void fabseries(int n) {
		int a=0, b=1;
		System.out.println(a+ " " + b);
		for (int i =2; i<n;i++) {
			int c = a + b;
			System.out.println("\t " +c);
			a = b;
			b = c;
		}
	}
}
