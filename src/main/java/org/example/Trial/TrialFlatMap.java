package org.example.Trial;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TrialFlatMap {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "World", "Hell");
        System.out.println(words.stream().collect(Collectors.groupingBy(
                word -> word.charAt(0),
                Collectors.mapping(
                        name -> name.length(),
                        Collectors.toList()
                )
        )));
        System.out.println(words.stream().map(name -> name.length()).collect(Collectors.toList()));
        List<String> abc = words.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList
                ));
        System.out.println(abc);


    }
}
