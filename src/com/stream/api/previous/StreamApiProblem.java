package com.check.codepractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiProblem {

	public static void main(String[] args) {


		/*
		 * Q1 : Given a list of integers, find out all the even numbers that exist in
		 * the list using Stream functions? List<Integer> l =
		 * Arrays.asList(12,14,10,28,5,8,23,2,11); l.stream().sorted().filter(x -> x % 2
		 * == 0).collect(Collectors.toList()).forEach(d -> System.out.println(d));
		 */
		
		/*
		 * Q2 : range between 1 to 100 of integers, find out all the even numbers that
		 * exist in the list using Stream functions? IntStream.range(1, 100).filter(x ->
		 * x % 2 ==0).forEach(System.out::println);
		 */
		
		/*
		 * Q3 Given a list of integers, find out all the numbers starting with 1 using
		 * Stream functions? IntStream.range(1,
		 * 150).mapToObj(Integer::toString).filter(x ->
		 * x.startsWith("1")).forEach(System.out::println);
		 */
		
		
		/* Q4 How to find duplicate elements in a given integers list in java using Stream functions?
		List<Integer> l  = Arrays.asList(12,14,10,12,5,8,10,2,11,2);
		l.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
					.entrySet().stream()
					.filter( x -> x.getValue() > 1)
					.map(Map.Entry::getKey)
					.collect(Collectors.toList())
					.forEach(System.out::println); */
		
		/* Q5 Given the list of integers, find the first element of the list using Stream functions?
		
		
		  List<Integer> l = Arrays.asList(40,12,14,10,28,5,8,23,2,11);
		  System.out.println(l.stream().findFirst().orElse(null));
		 */
		
		/* Q6 Given a list of integers, find the total number of elements present in the list using Stream functions?
		
		  List<Integer> l = Arrays.asList(40,12,14,10,28,5,8,23,2,11);
		  System.out.println(l.stream().count());
		 */
		
		/* Q6 Given a list of integers, find the maximum value element present in it using Stream functions?
		
		 * List<Integer> l = Arrays.asList(40,12,14,10,28,5,8,23,2,11);
		 * System.out.println(l.stream().max(Integer::compare).get());
		 */
		
		// Q7 Given a String, find the first non-repeated character in it using Stream functions?
		/* String s = "abcdefgijklmnopqrrrrrssss"; */
		/*
		  Character s1 = s.chars() .mapToObj(c
		 * -> (char) c) // Convert IntStream to Stream<Character> .filter(x -> x != ' ')
		 * // Exclude spaces .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new,
		 * Collectors.counting())) // Group and count occurrences .entrySet() .stream()
		 * .filter(y -> y.getValue() == 1) // Filter for characters with count == 1
		 * .map(z -> z.getKey()) // Map to the character (key) .findFirst() // Find the
		 * first non-repeated character .orElse(null);
		 * 
		 * System.out.println(s1);
		 */
			
		// Q8 Given a String, find the first repeated character in it using Stream functions?
		/*
		 * Character chara = s.chars() .mapToObj(c -> (char)c) .filter(c1 -> c1 != ' ')
		 * .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
		 * .entrySet().stream().filter(m -> m.getValue() > 1).map(o -> o.getKey())
		 * .findFirst().orElse(null); System.out.println(chara);
		 */
		 
		/* Q9 Count the Occurrences of Each Character 
		String s = "hello vishal how are you";
		s.chars().mapToObj(c -> (char)c).filter(c1 -> c1 != ' ').map(String::valueOf)
		.collect(Collectors.toList()).stream().collect(Collectors.groupingBy( n -> n, Collectors.counting())).forEach((x, y) ->
		System.out.println(x + " - " + y)); */
		String s = "hellov volvoa";
		Character cr = s.chars().mapToObj(c -> (char)c).filter(d -> d != ' ').collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1).map(g -> g.getKey()).findFirst().orElse(null);
		System.out.println(cr);
		
		String ss = s.chars().mapToObj(c -> (char)c).map(String::valueOf).collect(Collectors.toList())
		.stream().reduce((a, b) -> b+a).orElse(null);
		System.out.println(ss);
		
		/* Q10 find the 2nd highest salaried person from each department*/
		List<Employee> student = Arrays.asList(
				new Employee(1l, "vishal", "dev", 15000.0),
				new Employee(2l, "Ajay", "dev", 15500.0),
				new Employee(3l, "Rishu", "dev", 14000.0),
				new Employee(4l, "Rajani", "HR", 15000.0),
				new Employee(5l, "Advika", "HR", 15000.0),
				new Employee(6l, "Anurag", "HR", 15000.0)
				);
		
		
				
	}

}
class Employee {
	private Long id;
	private String name;
	private String dept;
	private Double salary;
	Employee(Long id, String name, String dept, Double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	Employee() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
