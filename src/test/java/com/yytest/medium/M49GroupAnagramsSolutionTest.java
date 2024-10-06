package com.yytest.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class M49GroupAnagramsSolutionTest {


//    @ParameterizedTest
//    @CsvSource(
//            {"eat;tea;tan;ate;nat;bat"}
//    )
    @Test
    void groupAnagrams() {
        M49GroupAnagramsSolution solution = new M49GroupAnagramsSolution();
       List<List<String>> list =  solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}