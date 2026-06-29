package com.stream.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacters {
    public static void main(String[] args) {
        String str = "aabbccddeeffgghhiijjkllmmnnooppqqrrssttuuvvwwxxyyz";
       List<Character> result = str.chars()
                .mapToObj(c -> (char)c)
                .collect(
                        Collectors.groupingBy(a -> a,
                                LinkedHashMap::new,
                                Collectors.counting() ))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(result);
    }
}
