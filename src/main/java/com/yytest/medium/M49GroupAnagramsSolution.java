package com.yytest.medium;

import java.util.*;

/**
 * @Description 49. Group Anagrams
 * Medium
 * Topics
 * Companies
 * Given an array of strings strs, group the
 * anagrams
 * together. You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * <p>
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * Explanation:
 * <p>
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 * Example 2:
 * <p>
 * Input: strs = [""]
 * <p>
 * Output: [[""]]
 * <p>
 * Example 3:
 * <p>
 * Input: strs = ["a"]
 * <p>
 * Output: [["a"]]
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 * @Author Emma
 * @Date 2024-09-30
 */
public class M49GroupAnagramsSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            List<String> list = result.get(sortedString);
            if (list == null) {
                list = new ArrayList<>();

            }
            list.add(s);
            result.put(sortedString, list);
        }
        List<List<String>> list =new ArrayList<>();
        result.forEach((k,v)->{
            list.add(v);
        });
        return list;
    }
}
