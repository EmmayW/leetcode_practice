package com.yytest.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
}