package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionByEvenOddNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        numbers.stream().collect(Collectors.partitioningBy(n -> n%2 ==0)).forEach((k,v) -> System.out.println(k + " : " + v));

    }
}
// Results: false : [1, 3, 5, 7]
//          true : [2, 4, 6, 8]