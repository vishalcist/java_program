package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringWithSpecificPrefix {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
       List<String> count = names.stream().filter(a -> a.startsWith("A")).collect(Collectors.toList());
        System.out.println(count);
    }
}
