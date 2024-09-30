package com.yytest.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 242. Valid Anagram
 * Easy
 * Topics
 * Companies
 * Given two strings s and t, return true if t is an
 * anagram
 * of s, and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * <p>
 * Output: false
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 * <p>
 * <p>
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 * @Author Emma
 * @Date 2024-09-28
 */
public class E242ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charArray = s.toCharArray();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (Character character : charArray) {
            Integer i = characterIntegerMap.get(character);
            if (i == null) {
                i = 1;
            } else {
                i++;
            }
            characterIntegerMap.put(character, i);
        }
        char[] charTArray = t.toCharArray();
        Map<Character, Integer> characterIntegerSecondMap = new HashMap<>();
        for (Character character : charTArray) {
            Integer i = characterIntegerSecondMap.get(character);
            if (i == null) {
                i = 1;
            } else {
                i++;
            }
            characterIntegerSecondMap.put(character, i);
        }
        for (Map.Entry<Character, Integer> entrySet : characterIntegerMap.entrySet()) {
            Integer i = characterIntegerSecondMap.get(entrySet.getKey());
            if (i == null || !i.equals(entrySet.getValue())) {
                return false;
            }
        }
        return true;
    }
}
