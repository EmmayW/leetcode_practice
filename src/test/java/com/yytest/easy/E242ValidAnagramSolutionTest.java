package com.yytest.easy;

import com.yytest.converter.StringIntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E242ValidAnagramSolutionTest {

    @ParameterizedTest(name = "{0} ,{1} , expected: {2}")
    @CsvSource({
            "anagram,nagaram,true",
            "rat,car,false"})
    public void isAnagram(String s, String t, boolean expected) {

        E242ValidAnagramSolution solution = new E242ValidAnagramSolution();
        assertEquals(expected, solution.isAnagram(s, t));
    }

    @ParameterizedTest
    @CsvSource({
            "10;16;28;13;2;21;5;18"})
    public void quickSort(@ConvertWith(StringIntegerArrayConverter.class) int[] arr) {

        E242ValidAnagramSolution solution = new E242ValidAnagramSolution();
//        solution.quickSort(arr,0,arr.length-1);

        System.out.println("Final:"+
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(", "))
        );

    }
}