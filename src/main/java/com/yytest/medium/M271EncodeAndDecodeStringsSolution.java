package com.yytest.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description String Encode and Decode
 * Design an algorithm to encode a list of strings to a single string.
 * The encoded string is then decoded back to the original list of strings.
 * <p>
 * Please implement encode and decode
 * <p>
 * Example 1:
 * <p>
 * Input: ["neet","code","love","you"]
 * <p>
 * Output:["neet","code","love","you"]
 * Example 2:
 * <p>
 * Input: ["we","say",":","yes"]
 * <p>
 * Output: ["we","say",":","yes"]
 * Constraints:
 * <p>
 * 0 <= strs.length < 100
 * 0 <= strs[i].length < 200
 * strs[i] contains only UTF-8 characters.
 * @Author yying
 * @Date 2024-10-06
 */
public class M271EncodeAndDecodeStringsSolution {

    public String encode(List<String> strs) {
        if (strs == null || strs.size() == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(String.format("%03d",str.length()));
            sb.append(str);
        }

        return sb.toString();
    }



    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int index = 0;
        while(index < str.length()) {
            Integer strLength = Integer.valueOf(str.substring(index,index+3));
            result.add(str.substring(index+3, index+3+strLength));
            index  = index + 3 + strLength;
        }


        return result;
    }
}
