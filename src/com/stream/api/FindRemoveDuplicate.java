package com.stream.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindRemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,2,5,6,1,7);
        Set<Integer> s = new HashSet<>();
        System.out.println("show duplicate: ");
        nums.stream().filter(a -> !s.add(a)).forEach(System.out::println);

        System.out.println("Removed duplicates: ");
        nums.stream().distinct().forEach(System.out::println);
    }

}
