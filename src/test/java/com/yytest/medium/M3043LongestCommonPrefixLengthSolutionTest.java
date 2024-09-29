package com.yytest.medium;

import com.yytest.converter.StringArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Date : 2024-09-27
 */
public class M3043LongestCommonPrefixLengthSolutionTest {

    @ParameterizedTest(name = "{0} ,{1} , LongestPrefixLength: {2}")
    @CsvSource({
            "1;10;100,1000, 3",
            "1;2;3,444, 0",
            "10,17;11, 1"
    })
    void longestCommonPrefix(@ConvertWith(StringArrayConverter.class) int[] arr1, @ConvertWith(StringArrayConverter.class) int[] arr2, int expectedResult) {
        M3043LongestCommonPrefixLengthSolution solution = new M3043LongestCommonPrefixLengthSolution();
        assertEquals(expectedResult, solution.longestCommonPrefix(arr1, arr2),
                () -> arr1 + " + " + arr2 + " should equal " + expectedResult);
    }
}
