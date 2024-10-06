package com.yytest.medium;

import java.util.*;
import java.util.stream.Collector;

/**
 * @Description 347. Top K Frequent Elements
 * Medium
 * Topics
 * Companies
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 * <p>
 * <p>
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 * @Author Emma
 * @Date 2024-09-30
 */
public class M347TopKElementSolution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        //return map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(k).mapToInt(Map.Entry::getKey).toArray();

        Map<Integer, List<Integer>> countMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (!countMap.containsKey(entry.getValue())) {
                countMap.put(entry.getValue(), new ArrayList<>());
            }

            countMap.get(entry.getValue()).add(entry.getKey());
        }
        Integer[] integers = countMap.keySet().stream().toArray(Integer[]::new);


        Arrays.sort(integers, Collections.reverseOrder());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.min(k, integers.length) && result.size() < k; i++) {
            result.addAll(countMap.get(integers[i]));
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
