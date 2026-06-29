package com.stream.api;

public class FindFirstNonRepeatedCaracter {
    public static void main(String[] args) {
        String str = "Swiss";

        Character cc =  str.toLowerCase().chars().mapToObj(c -> (char)c)
                .filter(a -> str.indexOf(a) == str.lastIndexOf(a))
                .findFirst()
                .orElse(null);
        System.out.println(cc);
    }
}
