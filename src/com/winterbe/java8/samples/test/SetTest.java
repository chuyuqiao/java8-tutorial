package com.winterbe.java8.samples.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args){
        test_set_construct();
    }

    private static void test_set_construct() {
        Set<String> set=new HashSet<>(Arrays.asList("a","b","c","a"));
        set.forEach(System.out::println);
    }
}
