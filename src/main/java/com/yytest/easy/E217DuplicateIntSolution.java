package com.yytest.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * Duplicate Integer
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 *
 * Example 1:
 *
 * Input: nums = [1, 2, 3, 3]
 *
 * Output: true
 * Example 2:
 *
 * Input: nums = [1, 2, 3, 4]
 *
 * Output: false
 * @Author Emma
 * @Date 2024-09-28
 */
public class E217DuplicateIntSolution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
}
