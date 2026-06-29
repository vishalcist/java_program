package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class OddEvenNumber {
    public static void main(String[] args) {
        System.out.println("Even numbers:");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        numbers.stream().filter(c -> c % 2 == 0).forEach(System.out::println);

        System.out.println("Odd numbers:");
        numbers.stream().filter( d-> d %2!=0).forEach(System.out::println);
    }
}
