package com.stream.api;

import java.util.stream.Collectors;

public class SameCharacterCount {
    public static void main(String[] args) {
        String str = "Mynameisvishalkumarpallava";

        str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(a -> a, Collectors.counting())).forEach((k,v) -> System.out.println(k + " : " + v));
    str.codePoints().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(a -> a, Collectors.counting())).forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
