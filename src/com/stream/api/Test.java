package com.stream.api;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Annie", "Alex", "Charlie");
        String data = "vishalkumarpallava";
        int x = 1;
        Set<Character> s = new HashSet<>();
        switch(x) {
            case 1:
                // Find duplicate characters in string
              Optional<String> duplicates = data.chars().mapToObj(c -> (char)c).filter(y -> s.add(y))
                     .map(String::valueOf)
                     .reduce((a,b)-> a+b);
                System.out.println(duplicates);

            case 2:
                //Reverse string
                String name = "vishal";
                name.chars().mapToObj(c -> (char)c).

        }
    }
}
