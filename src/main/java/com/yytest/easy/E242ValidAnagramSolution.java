package com.yytest.easy;

import java.util.Arrays;
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
        sort(charArray);
        String s1 =String.valueOf(charArray);
        char[] charArray2 = t.toCharArray();
        sort(charArray2);
        String s2 =String.valueOf(charArray2);
        return s1.equals(s2);
    }

    public void sort(char[] chars){
        for(int i = 0 ;i < chars.length;i++){
            for(int j = i+1;j<chars.length;j++){
                if(chars[i]>chars[j]){
                    char tmp = chars[i];
                    chars[i] = chars[j];
                    chars[j]= tmp;
                }
            }
        }
    }
}
