package com.check.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CountRepeatedCharInString {

	public static void main(String[] args) {

String s  = "Hello this is vishal my home town is deoria";

Map<Character, Long> m = s.toLowerCase().chars().mapToObj(c -> (char) c).filter( x -> x != ' ').collect(Collectors.groupingBy(c -> c, Collectors.counting()));

m.forEach((n,p) -> {
	if (p > 1) {
		System.out.println(n+" - "+ p);
	}
});

	}

}
