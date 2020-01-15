package com.example.java8_test.Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl","abc");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        Set<String>  filteredSet = filtered.stream().filter(string -> !string.isEmpty()).collect(Collectors.toSet());
        Iterator<String> listIterator = filtered.iterator();
        Iterator<String> IfilteredSet = filteredSet.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("--*--");
        while(IfilteredSet.hasNext()){
            System.out.println(IfilteredSet.next());
        }
    }
}
