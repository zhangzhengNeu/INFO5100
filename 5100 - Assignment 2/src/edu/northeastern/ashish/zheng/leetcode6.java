package edu.northeastern.ashish.zheng;

import java.util.HashMap;
import java.util.Map;

public class leetcode6 {

  public static boolean isIsomorphic(String s, String t) {
    Map<Character, Character> s2t = new HashMap<Character, Character>();
    Map<Character, Character> t2s = new HashMap<Character, Character>();
    int len = s.length();
    for (int i = 0; i < len; ++i) {
      char x = s.charAt(i), y = t.charAt(i);
      if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
        return false;
      }
      s2t.put(x, y);
      t2s.put(y, x);
    }
    return true;
  }
}
