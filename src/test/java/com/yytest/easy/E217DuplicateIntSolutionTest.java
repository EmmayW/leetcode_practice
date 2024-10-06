package com.yytest.easy;

import com.yytest.converter.StringIntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Description
 * @Author Emma
 * @Date 2024-09-28
 */
public class E217DuplicateIntSolutionTest {

    @ParameterizedTest(name = "{0}  , expected: {1}")
    @CsvSource({
            "1;2;3;3,true",
            "1;2;3;4,false"
    })
    public void hasDuplicate(@ConvertWith(StringIntegerArrayConverter.class) int[] arr, boolean expectedResult){
        E217DuplicateIntSolution e217DuplicateIntSolution =new E217DuplicateIntSolution();
        assertEquals(expectedResult, e217DuplicateIntSolution.hasDuplicate(arr));
    }
}
