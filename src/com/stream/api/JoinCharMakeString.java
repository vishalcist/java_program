package com.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class JoinCharMakeString {
    public static void main(String[] args) {
        List<Character> chars = List.of('H', 'e', 'l', 'l', 'o');
        String result = chars.stream()
                .map(String::valueOf).reduce("", (a, b) -> b + a);
        System.out.println(result); // Output: Hello
    }
}
