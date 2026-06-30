package com.check.codepractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {

		// sort integer
//List<Integer> l = Arrays.asList(12,15,3,56,43,25,13,2,9);
//System.out.println(l);
//Collections.sort(l);
//System.out.println(l);
//Collections.sort(l, (i, j) -> i>j?-1:(i<j)?1:0);
//System.out.println(l);

		// sort string
//		List<String> l = Arrays.asList("a", "c", "b", "f", "e", "d");
//		System.out.println(l);
//		Collections.sort(l);
//		System.out.println(l);
//		Collections.sort(l, Collections.reverseOrder());
//		System.out.println(l);
		
		TreeSet<String> l = new TreeSet<String>();
		l.add("a");
		l.add("g");
		l.add("c");
		l.add("e");
		l.add("d");
		l.add("f");
		l.add("b");
		System.out.println(l);
		//Collections.sort(l);
		System.out.println(l);
		//Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
	}

}
