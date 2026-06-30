package com.check.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.check.model.Student;

public class StreamSorting {

	public static void main(String[] args) {
		 List<Student> students = Arrays.asList(
		            new Student(85, "Alice"),
		            new Student(72, "Bob"),
		            new Student(90, "Charlie"),
		            new Student(65, "David"),
		            new Student(155, "Davdddid"),
		            new Student(67, "Dhgseavid")
		        );
		 
		 List<Student> sortedList = students.stream().sorted(Comparator.comparingInt(Student::getMarks).reversed()).collect(Collectors.toList());
		 System.out.println(sortedList);
		 sortedList.forEach(System.out::println);
		 List<Student> so =students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		 so.forEach(x -> System.out.println(x.getName() + " - " + x.getMarks()));
		 
		 
		 
		 // Reverse the string
		 
		 String s = "Hello world 1111";
		 
		 String rs = s.chars().mapToObj(c -> (char)c)
				 .map(String::valueOf)
				 .collect(Collectors.toList())
				 .stream()
				 .reduce((a, b) -> b + a)
				 .orElse("");
		 System.out.println(rs);
		 
	// Count the character how many times repeated in the string	 
		 Map<Character, Long> cm = s.chars()
				 					.mapToObj(c3 -> (char) c3)
				 					.filter(c1 -> c1 !=' ')
				 					.collect(Collectors.groupingBy(c2 -> c2, Collectors.counting()));
		 
		 cm.forEach((k, v) -> System.out.println(k + " -> " + v));
		 
		 
		// Remove duplicate from list and get unique data in list
			
			List<Integer> l = Arrays.asList(1,2,3,2,4,5,6,4,5,7);
			List<Integer> u = l.stream().distinct().collect(Collectors.toList());
			u.forEach(System.out::println);

			
	 // Get the common value in 2 list
			
			List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
			List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
			
			List<Integer> common = list1.stream().filter(list2::contains).collect(Collectors.toList());
			System.out.println("===================");
			common.forEach(System.out::println);
			
			int x=9;
			int y=6;
			System.out.println((x < y) ? "x is smaller than y" : "x is larger than y");
			
			
//			String p = "baabaad";
//			p.chars().mapToObj(c -> (char)c).collect(Po)
			
			
			List<String> ls = List.of("vishal", "shekhar", "avinash", "ajay","ajay");
			List<String> ls1 = List.of("vishal","avinash", "shekhar");
			
			Set<String> set = new HashSet<String>(ls1);
			List<String> lss =ls.stream().filter(x1 -> !set.contains(x1)).collect(Collectors.toList());
			lss.forEach(System.out::println);
			
			Set<String> set1 = new HashSet<>();
			ls.stream().filter(xx -> !set1.add(xx)).collect(Collectors.toSet()).forEach(System.out::println);
			
			
			// ====================================================
			
		    List<Employee> employees = Arrays.asList(
		            new Employee("John", "IT", 50000),
		            new Employee("Jane", "HR", 45000),
		            new Employee("Jim", "IT", 60000),
		            new Employee("Jake", "Sales", 55000),
		            new Employee("Jill", "Sales", 50000),
		            new Employee("Jerry", "HR", 47000)
		        );
		    
//		  employees.stream()
//		  .collect(Collectors
//				  .groupingBy(Employee::getDepartment, 
//						  Collectors.counting()))
//		  .entrySet().forEach((data1, data2) -> data1 + "-" + data2);
		  
		Map<String, Long> emp =  employees.stream()
          .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		emp.forEach((x5, y5) -> System.out.println(x5+":"+y5));
		System.out.println("=============================================");
	Map<String, Double>	emp1 = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, 
						Collectors.averagingDouble(Employee::getSalary)));
	
	emp1.forEach((x6, y6) -> System.out.println(x6+":"+y6));
		    
	}
	
	

}
