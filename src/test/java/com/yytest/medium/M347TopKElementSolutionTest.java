package com.yytest.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M347TopKElementSolutionTest {

    @Test
    void topKFrequent() {
//        int[] nums = new int[]{1,1,1,2,2,3};
        M347TopKElementSolution m347TopKElementSolution = new M347TopKElementSolution();
//        int[] result = m347TopKElementSolution.topKFrequent(nums, 2);
//
//        int[] expected = {1,2};
//        assertArrayEquals(expected, result);
//
//        int[] nums2 = new int[]{1};
//        int[] result2 = m347TopKElementSolution.topKFrequent(nums2, 1);
//        int[] expected2 = {1};
//        assertArrayEquals(expected2, result2);
//
//        int[] nums3 = new int[]{1,2};
//        int[] result3 = m347TopKElementSolution.topKFrequent(nums3, 2);
//        int[] expected3 = {1,2};
//        assertArrayEquals(expected3, result3);
//
//        int[] nums4 = new int[]{-1,-1};
//        int[] result4= m347TopKElementSolution.topKFrequent(nums4, 1);
//        int[] expected4 = {-1};
//        assertArrayEquals(expected4, result4);

        int[] nums5 = new int[]{4,1,-1,2,-1,2,3};
        int[] result5= m347TopKElementSolution.topKFrequent(nums5, 2);
        int[] expected5 = {-1,2};
        assertArrayEquals(expected5, result5);

    }
}