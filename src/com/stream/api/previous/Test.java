package com.check.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.check.model.Student;

public class Test {

	public static void main(String[] args) {
//		Set<Student> students = new HashSet<Student>();
//		students.add(new Student(12, "vishal"));
//		students.add(new Student(20, "vishal123"));
//		students.add(new Student(15, "Manish"));
//		students.add(new Student(30, "Manish"));
//		
//		students.stream().map(Student::getName).collect(Collectors.groupingBy(Collectors.counting(), Function.identity()));
//		
		
		 Set<Student> students = new HashSet<>();
	        students.add(new Student(12, "vishal"));
	        students.add(new Student(112, "vishal"));
	        students.add(new Student(20, "vishal123"));
	        students.add(new Student(15, "Manish"));
	        students.add(new Student(30, "Manish"));
	        students.add(new Student(130, "Jitendra"));

//	       //  Using Stream API to group students by name, and filter those with how many time occurrence
//	        students.stream()
//	            .collect(Collectors.groupingBy(Student::getName)) // Group students by name
//	            .entrySet().stream() // Convert the map entries into a stream
//	           // .filter(entry -> entry.getValue().size() > 1) // Filter out names that are not repeated
//	            .forEach(entry -> { // For each group of repeated names
//	                System.out.println("Name: " + entry.getKey() + " is repeated " + entry.getValue().size() + " times.");
//	                entry.getValue().forEach((s1) -> System.out.println("Marks: " + s1.getMarks()));
//	            });
	        getRepeatationOfName(students);
	       
	}

	public static void getRepeatationOfName(Set<Student> students) {
		Set<Student> s = students.stream().sorted(Comparator.comparingInt(Student::getMarks)).collect(Collectors.toSet());
		Map<Integer, Long> m = s.stream().collect(Collectors.groupingBy(Student::getMarks, Collectors.counting()));
		m.forEach((name, count) -> System.out.println( name + " : " + count));
				
			// combined in single pipeline
		System.out.println("========================================================");
		students.stream()
        .sorted(Comparator.comparingInt(Student::getMarks))  // Sort by marks
        .collect(Collectors.groupingBy(Student::getName, Collectors.counting()))  // Group by marks and count
        .forEach((marks, count) -> System.out.println(marks + " : " + count));  //
	}
}