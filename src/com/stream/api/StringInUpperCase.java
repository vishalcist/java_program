package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class StringInUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api");
        names.stream().map(String :: toUpperCase).forEach(System.out::println);
    }

}
