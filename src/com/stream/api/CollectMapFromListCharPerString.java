package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMapFromListCharPerString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        words.stream().collect(Collectors.toMap(w -> w, String :: length)).forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
