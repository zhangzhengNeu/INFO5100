package edu.northeastern.ashish.zheng;


/*Question 4) Given a string s, find the length of the longest substring without repeating
        characters.
        Ex: Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/

import java.util.HashMap;


public class Question4 {

    public static String lengthOfLongestSubstring(String string) {
        int n = string.length(),startPoint = 0,curLength = 0,maxlength = 0,left = 0,index;

        HashMap<Character,Integer> pos = new HashMap<Character, Integer>();
            pos.put(string.charAt(0), 0);
            for (index = 1; index < n; index++) {
                if (!pos.containsKey(string.charAt(index))) {
                    pos.put(string.charAt(index), index);
                }
                else {
                    if (pos.get(string.charAt(index)) >= startPoint) {
                        curLength = index - startPoint;
                        if (maxlength < curLength) {
                            maxlength = curLength;
                            left = startPoint;
                        }
                        startPoint = pos.get(string.charAt(index)) + 1;
                    }
                    pos.replace(string.charAt(index), index);
                }
            }
            if (maxlength < index - startPoint) {
                maxlength = index - startPoint;
                left = startPoint;
            }
            return string.substring(left, left + maxlength);
    }
}